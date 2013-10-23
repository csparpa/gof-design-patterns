from concrete_prototype import ConcretePrototype
from datetime import datetime

if __name__ == "__main__":
    
    print("***Demo: prototype pattern")
    instance1 = ConcretePrototype("Frank", 30, {"birth": datetime(1983, 7, 3), \
                                  "gender": "M"})
    instance1.greet()
    instance2 = instance1.clone()
    instance2.greet()
    print("Checking: if prototypes are equal")
    if instance1 == instance2:
        print("True")
    else:
        print("False")