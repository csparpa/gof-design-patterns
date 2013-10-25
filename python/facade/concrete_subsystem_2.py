from abstract_subsystem_2 import AbstractSubsystem2

class ConcreteSubsystem2(AbstractSubsystem2):
    
    """Concrete implementation of AbstractSubsystem2"""
    
    def __init__(self):
        pass
        
    def compute_age(self, abstract_subsystem_1, current_year):
        return current_year - abstract_subsystem_1.get_year_of_birth()