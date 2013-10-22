from concrete_builder import ConcreteBuilder
from director import Director

if __name__ == "__main__":
    print("***Demo: builder pattern")
    builder = ConcreteBuilder()
    director = Director(builder)
    product = director.construct()