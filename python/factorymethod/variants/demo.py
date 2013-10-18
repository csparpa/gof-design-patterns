from gofdp.factorymethod.variants.creator_base_implementation import CreatorBaseImplementation
from gofdp.factorymethod.abstract_product import AbstractProduct
from parametric_creator import ParametricCreator

class MyConcreteProduct(AbstractProduct):
    """
    Another concrete implementation of AbstractProduc
    """
    def feature(self):
        print("Called: my product feature");
            
class ExtendedCreatorImplementation(CreatorBaseImplementation):
    """
    Subclass for CreatorBaseImplementation which redefines the base implementation
    by returning a MyConcreteProduct instance
    """
    def new_abstract_product(self):
        print("Called: extended implementation for template method")
        return MyConcreteProduct()

if __name__ == '__main__':

        print("***Demo: base implementation for factory method")
        simpleCreator = CreatorBaseImplementation()
        product1 = simpleCreator.factory_method();
        product1.feature()
        
        print("");
        
        print("***Demo: extending factory method's base implementation")
        extendedCreator = ExtendedCreatorImplementation()
        product2 = extendedCreator.factory_method()
        product2.feature()
        
        print("")
        
        print("***Demo: parametric factory method")
        parametricCreator = ParametricCreator()
        product3 = parametricCreator.factory_method("ConcreteProduct")
        product3.feature()
