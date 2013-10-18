from abc import ABCMeta, abstractmethod

class AbstractProductY():
    """
    Abstract interface for products of type Y
    """
    
    __metaclass__ = ABCMeta
    
    @abstractmethod
    def feature(self):
        pass