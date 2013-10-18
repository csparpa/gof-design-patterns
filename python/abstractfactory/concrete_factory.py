from abstract_factory import AbstractFactory
from concrete_product_X import ConcreteProductX
from concrete_product_Y import ConcreteProductY

class ConcreteFactory(AbstractFactory):
    """
    Concrete implementation for AbstractFactory class: this class implements the
    creational methods for all the products of a specific family
    """
    def create_product_X(self):
        print("Called: implementation of abstract factory; will return: " + \
              "ConcreteProductX instance")
        return ConcreteProductX()

    def create_product_Y(self):
        print("Called: implementation of abstract factory; will return: " + \
              "ConcreteProductY instance")
        return ConcreteProductY()