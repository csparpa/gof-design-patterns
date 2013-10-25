from abc import ABCMeta, abstractmethod

class AbstractFacade():
    
    """
    This is the abstract interface for the Facade which will be used
    by the clients
    """
    __metaclass__ = ABCMeta
    
    @abstractmethod
    def greet(self):
        pass