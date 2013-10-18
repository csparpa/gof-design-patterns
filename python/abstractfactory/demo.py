from abstract_factory import AbstractFactory
from concrete_factory import ConcreteFactory
from abstract_product_X import AbstractProductX
from abstract_product_Y import AbstractProductY


class MyConcreteProductX(AbstractProductX):
    """Another concrete implementation of AbstractProductX"""
    def feature(self):
        print("Called: feature of my concrete product X")

class MyConcreteProductY(AbstractProductY):
    """Another concrete implementation of AbstractProductY"""
    def feature(self):
        print("Called: feature of my concrete product Y")

class MyConcreteFactory(AbstractFactory):
    """
    Another concrete implementation for AbstractFactory
    """
    def create_product_X(self):
        print("Called: my implementation of abstract factory; will return: " + \
              "MyConcreteProductX instance")
        return MyConcreteProductX()

    def create_product_Y(self):
        print("Called: my implementation of abstract factory; will return: " + \
              "MyConcreteProductY instance")
        return MyConcreteProductY()

if __name__ == "__main__":

    print("***Demo: abstract factory pattern")
    factory1 = ConcreteFactory()
    productX1 = factory1.create_product_X()
    productX1.feature()
    productY1 = factory1.create_product_Y()
    productY1.feature()
    
    print("")
    
    print("***Demo: adding a new AbstractFactory implementation")
    
    #New implementation for AbstractFactory class, returning new implementations
    #for AbstractProductX and AbstractProductY
    factory2 = MyConcreteFactory()
    
    productX2 = factory2.create_product_X()
    productX2.feature()
    productY2 = factory2.create_product_Y()
    productY2.feature()