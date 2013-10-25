from abc import ABCMeta, abstractmethod

class AbstractSubsystem2():
    
    """
    This is the interface of one of the subsystems
    Modify as needed!
    """
    __metaclass__ = ABCMeta
    
    @abstractmethod
    def compute_age(self, abstract_subsystem_1, current_year):
        pass