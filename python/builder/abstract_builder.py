from abc import ABCMeta, abstractmethod

class AbstractBuilder():
    
    """
    This is the abstract interface for creating parts of a complex product.
    """
    
    __metaclass__ = ABCMeta
    
    """Builds part A of the product"""
    @abstractmethod
    def build_part_A(self):
        pass

    """Builds part B of the product"""
    @abstractmethod
    def build_part_B(self):
        pass

    """Returns the complete instance of the product"""
    @abstractmethod
    def get_product(self):
        pass