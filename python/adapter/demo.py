from adaptee import Adaptee
from object_adapter import ObjectAdapter

if __name__ == "__main__":
    print("***Demo: pattern Adapter with object adaptation")
    print("Creating: Adaptee")
    adaptee = Adaptee(3.2, 6.7)
    print("Creating: object adapter")
    objectAdapter = ObjectAdapter(adaptee)
    print("Getting: operands through the Adaptee interface")
    print(str(adaptee.get_first_operand()))
    print(str(adaptee.get_second_operand()))
    print("Getting: operands through the ObjectAdapter interface")
    print(str(objectAdapter.get_operands()))
    print("Getting: operands sum through the Adaptee interface")
    print(str(adaptee.compute_sum()))
    print("Getting: operands sum through the Adapter interface")
    print(str(objectAdapter.sum()))