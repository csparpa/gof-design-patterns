from abc import ABCMeta, abstractmethod

class AbstractFactory():
    """
    This is the abstract factory class, grouping together the creational methods
    for each product in the product family. Note that the created products are
    returned with their asbtract interfaces. Modify it as needed!
    """
    
    __metaclass__ = ABCMeta
    
    @abstractmethod
    def create_product_X(self):
        pass

    @abstractmethod
    def create_product_Y(self):
        pass