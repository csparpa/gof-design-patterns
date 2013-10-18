from abc import ABCMeta, abstractmethod

class AbstractProductX():
    """
    Abstract interface for products of type X
    """
    
    __metaclass__ = ABCMeta
    
    @abstractmethod
    def feature(self):
        pass