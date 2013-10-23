from abstract_prototype import AbstractPrototype
from copy import deepcopy

class ConcretePrototype(AbstractPrototype):

    """
    Concrete implementation of the abstract interface for object cloning.
    """
    
    _name = None
    _age = None
    _data = None
    
    def __init__(self, name, age, data=None):
        self._name = name
        self._age = age
        self._data = data

    """
    Implementation of the cloning interface. Notice that we are relying on
    the deepcopy module to ensure that all instance variables are properly
    copied (recursively along with their sub-objects)
    """
    def clone(self):
        print("Cloning this object")
        the_clone = ConcretePrototype(deepcopy(self._name),
                                    deepcopy(self._age),
                                    deepcopy(self._data));
        return the_clone
    
    def greet(self):
        print("Hi I am a concrete protoype, name="+self._name+ \
              " age="+str(self._age)+" with data="+str(self._data))
    
    """Redefining the == operator so that equality comparisons can be made"""
    def __eq__(self, other):
        return self._name == self._name and self._age == self._age and \
            self._data == self._data