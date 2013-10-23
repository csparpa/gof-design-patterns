from abc import ABCMeta, abstractmethod

class AbstractPrototype():
    """
    This class provides the abstract interface for object prototyping, consisting
    in just a clone operaton. The class implements the java.lang.Cloneable 
    interface, which marks this type as cloneable using the clone() method of 
    the Object ancestral class.
    """
    
    __metaclass__ = ABCMeta

    """This is the clone operation to be implemented by concrete subclass protypes"""
    @abstractmethod
    def clone(self):
        pass
    
    """An operation. Modify it or add yours!"""
    @abstractmethod
    def greet(self):
        pass