from component import Component

class Decorator(Component):

    """
    This concrete decorator adds further state and responsibilities to the
    decorated component
    """
    
    _decorated = None
    _job = None
    
    def __init__(self, decorated, job):
        self._decorated = decorated
        self._job = job
        
    def get_job(self):
        return self._job
    
    def get_name(self): 
        return self._decorated.get_name()
    
    def get_age(self): 
        return self._decorated.get_age()