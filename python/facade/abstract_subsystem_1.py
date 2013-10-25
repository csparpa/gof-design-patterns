from abc import ABCMeta, abstractmethod

class AbstractSubsystem1():
    
    """
    This is the interface of one of the subsystems
    Modify as needed!
    """
    __metaclass__ = ABCMeta
    
    @abstractmethod
    def get_name(self):
        pass
    
    @abstractmethod
    def get_year_of_birth(self):
        pass