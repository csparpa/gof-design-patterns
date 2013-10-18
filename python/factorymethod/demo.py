from concrete_creator import ConcreteCreator

if __name__ == '__main__':
    print("***Demo: factory method pattern")
    factory = ConcreteCreator()
    product = factory.factory_method();
    product.feature();