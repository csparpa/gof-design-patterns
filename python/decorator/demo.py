from component import Component
from decorator import Decorator

if __name__ == "__main__":
    print("***Demo: pattern Decorator")
    print("Creating: a component with name=Bob, age=30")
    component = Component("Bob", 30)
    print("Decorating: with new state and behaviour regarding " + \
                "job. Will be job=teacher");
    decorator = Decorator(component, "teacher")
    print("Testing: behaviours of decorated component")
    print("name="+decorator.get_name())
    print("age="+str(decorator.get_age()))
    print("job="+decorator.get_job())
    
    print("***Demo: pattern Decorator via duck-typed, dynamically added methods")
    print("Defining: new behaviour as a function")
    def greet(self):
        print "Hi I am %s, I am %s and I am a %s" % \
            (self.get_name(), str(self.get_age()), self.get_job())
    print greet
    print("Binding: the new behaviour to the Decorator class")
    setattr(Decorator, 'greet', greet)
    print("Invoking: the new behaviour")
    decorator.greet()
    