from abstract_product import AbstractProduct

class ConcreteProduct(AbstractProduct):

    """
    Concrete implementation of products interface. Modify it in order to 
    instantiate your own ones!
    """

    def __init__(self):
        print("Created: concrete product instance")        
    
    def feature(self):
        print("Called: concrete product feature")
