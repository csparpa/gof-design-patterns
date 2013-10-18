from gofdp.factorymethod.concrete_product import ConcreteProduct

class CreatorBaseImplementation():
    
    """
    This concrete class is an alternative to the usage of the hierarchy: abstract 
    creator class + concrete creator class. This class provides a base 
    implementation for the template method, that is  encapsulated into a separate
    method so that subclasses can overwrite it, if they need so.
    """

    """Factory method calling a separate method implementing object creation"""     
    def factory_method(self):
        return self.new_abstract_product()

    """
    This method is the one to be modified (if needed) by subclasses. Modify
    it if you want to return concrete implementations of AbstractProduct
    other than ConcreteProduct!
    """
    def new_abstract_product(self):
        print("Called: basic implementation of template method that may be " + \
              "overridden")
        return ConcreteProduct();
