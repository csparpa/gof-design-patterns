class Adaptee():
    """
    This is the "legacy" class that must be adapted to the target interface.
    """    
    _operand_1 = None
    _operand_2 = None
    
    def __init__(self, operand_1, operand_2):
        self._operand_1 = operand_1
        self._operand_2 = operand_2

    def get_first_operand(self):
        return self._operand_1
    
    def get_second_operand(self):
        return self._operand_2
    
    def compute_sum(self):
        return self._operand_1 + self._operand_2
    
    def max(self):
        return max(self._operand_1, self._operand_2)