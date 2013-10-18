from abstract_product_Y import AbstractProductY

class ConcreteProductY(AbstractProductY):
    
    """
    Concrete implementation of AbstractProductTypeY
    """

    def feature(self):
        print("Called: feature of concrete product Y")