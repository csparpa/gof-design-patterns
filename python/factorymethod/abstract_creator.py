from abc import ABCMeta, abstractmethod

class AbstractCreator():
 
    """
    Abstract class defining the factory method. Modify the method's signature
    as needed. Please note that the factory method does not accept parameters
    and children classes are forced to define the body of the method.
    """
    __metaclass__ = ABCMeta
    
    @abstractmethod
    def factory_method(self):
        pass