"""""
This class represents the complex object to be built
"""
class Product():
    
    _part_A = None
    _part_B = None
    
    def add_part_A(self, part):
        print("Adding: partA to Product instance")
        self._part_A = part
    
    def add_part_B(self, part):
        print("Adding: partB to Product instance")
        self._part_B = part
