from datetime import datetime
from concrete_facade import ConcreteFacade
from concrete_subsystem_1 import ConcreteSubsystem1
from concrete_subsystem_2 import ConcreteSubsystem2

if __name__ == "__main__":
    print("***Demo: pattern Facade")
    print("Creating: subsystems module 1")
    subsystem1 = ConcreteSubsystem1("Bob", 1983)
    print("Creating: subsystems module 2")
    subsystem2 = ConcreteSubsystem2()
    print("Creating: concrete facade")
    facade = ConcreteFacade(subsystem1, subsystem2)
    print("Invoking: the behaviour stated in the facade")
    facade.greet()
    
    print("Invoking: the same behaviour as before but " + \
            "invoked without using the facade. It is much more complex!")
    name = subsystem1.get_name()
    birth = subsystem1.get_year_of_birth()
    age = subsystem2.compute_age(subsystem1, datetime.now().year)
    print "Hello, my name is %s, I was born in %s and therefore I am %s" % \
            (name, str(birth), str(age))