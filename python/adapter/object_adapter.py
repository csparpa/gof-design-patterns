class ObjectAdapter():

    """
    This is the Adapter class: it implements the target interface that is expected
    by the clients and is composed of an Adaptee object instance. In this case, 
    adaptation is achieved through composition. Please notice that, as Python
    is dinamically typed, it makes no sense to rely on type hierarchy because
    the clients can't be aware of the type definitions: instead, clients only 
    rely on duck typing. This also means that class adaptation is not a valid
    alternative.
    """    
    _adaptee = None
    
    def __init__(self, adaptee):
        self._adaptee = adaptee

    def get_operands(self):
        return [ self._adaptee.get_first_operand(),
                self._adaptee.get_second_operand()]

    def sum(self):
        return self._adaptee.compute_sum()

    def multiply(self):
        return self._adaptee.get_first_operand() * \
            self._adaptee.get_second_operand()

    def max(self):
        return self._adaptee.max()