from datetime import datetime
from abstract_facade import AbstractFacade

class ConcreteFacade(AbstractFacade):
    
    """
    This is the concrete implementation of the abstract facade interface.
    """
    _subsystem1 = None
    _subsystem2 = None
    
    def __init__(self, subsystem1, subsystem2):
        self._subsystem1 = subsystem1
        self._subsystem2 = subsystem2
    
    def greet(self):
        name = self._subsystem1.get_name()
        birth = self._subsystem1.get_year_of_birth()
        age = self._subsystem2.compute_age(self._subsystem1, datetime.now().year)
        print "Hello, my name is %s, I was born in %s and therefore I am %s" % \
            (name, str(birth), str(age))
        