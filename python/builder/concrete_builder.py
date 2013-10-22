from abstract_builder import AbstractBuilder
from product import Product

class ConcreteBuilder(AbstractBuilder):
    """
    Concrete implementation for AbstractBuilder. Please notice that this class
    also offers a method for returning the whole, newly-created product
    """
    
    _product = None
    
    def __init__(self):
        self._product = Product()

    def build_part_A(self):
        print("Building part A of complex object")
        self._product.add_part_A("I am a complex object")

    def build_part_B(self):
        print("Building part B of complex object")
        self._product.add_part_B("I am a complex object")
            
    def get_product(self):
        print("Created: new Product instance")
        return self._product