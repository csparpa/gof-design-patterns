from abstract_creator import AbstractCreator
from concrete_product import ConcreteProduct 

class ConcreteCreator(AbstractCreator):

    """
    Implementation of abstract factory class and method. Modify it as you need!
    """
    
    def factory_method(self):
        print  "Called: implementation of factory method; will return: ConcreteProduct instance"
        return ConcreteProduct()