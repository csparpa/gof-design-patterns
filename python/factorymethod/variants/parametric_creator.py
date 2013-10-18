from gofdp.factorymethod.concrete_product import ConcreteProduct

class ParametricCreator():

    """
    This concrete class is an alternative to the usage of the hierarchy: abstract 
    creator class + concrete creator class. The parameter value triggers which 
    AbstractProduct subclass is instantiated by the factory method.
    Subclasses may owerwrite the factory method in order to add additional checks
    on the parameter value or modify the existing ones.
    """
    
    def factory_method(self, parameter):
        """The parametric factory method. Modify it as needed!"""
        if parameter == "ConcreteProduct":
            print("Called: parametric creator; will return: ConcreteProduct instance")
            return ConcreteProduct()
        # Remove the 'else' clause and add your code here
        else:
            raise Exception("Invalid parameter value")
