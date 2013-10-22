"""
This class is used by the clients to create new Product instances by using
an AbstractBuilder object.
"""
class Director():
    
    _builder = None
    
    def __init__(self, abstract_builder_subtype):
        self._builder = abstract_builder_subtype
    
    """ 
    This method builds the whole new Product instance. The creation
    of the single parts is delegated to the AbstractBuilder instance, as
    well as the provisioning of the instance
    """
    def construct(self):
        self._builder.build_part_A()
        self._builder.build_part_B()
        return self._builder.get_product()