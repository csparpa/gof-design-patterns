from threading import Lock

class Monostate:
    
    """
    This class is instantiable multiple times and each instance will share the
    same predefined state with all the other instances: this is the Monostate
    pattern.
    """
    
    _shared_state = {'state': 'X'}
    
    def __init__(self):
        """
        If all instances have the same __dict__, they all share the same 
        attributes (state)
        """
        self.__dict__ = self._shared_state
    
    """
    This function must be thread-sefe, as it modifies the state shared among all
    Monostate instances. Here I am using locks but one could think of different
    ways of handling concurrency (eg: a 'with' block in Python 2.5+)
    """
    def set_state(self, dictionary):
        lock = Lock()
        lock.acquire()
        self._shared_state = dictionary.copy()
        lock.release()
    
    def greet(self):
        print("Hi I am a Monostate with state: "+str(self._shared_state))