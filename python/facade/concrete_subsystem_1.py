from abstract_subsystem_1 import AbstractSubsystem1

class ConcreteSubsystem1(AbstractSubsystem1):
    
    """Concrete implementation of AbstractSubsystem1"""
    
    _name = None
    _year_of_birth = None
    
    def __init__(self, name, year_of_birth):
        self._name = name
        self._year_of_birth = year_of_birth
        
    def get_name(self):
        return self._name
    
    def get_year_of_birth(self):
        return self._year_of_birth