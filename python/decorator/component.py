class Component():
    
    """
    This class represents the component that will be decorated with new 
    responsibilities
    """
    
    _name = None
    _age = None
    
    def __init__(self, name, age):
        self._name = name
        self._age = age
    
    def get_name(self):
        return self._name
    
    def get_age(self):
        return self._age