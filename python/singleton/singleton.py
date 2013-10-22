"""
You can't completely rely on a Python class if you want to sketch up a Singleton
as in Python there is no way of creating private members (eg: constructors) and
therefore you can't ensure that they won't be instantiated multiple times.

So, you can use a module with functions instead of a class, because each module 
IS a singleton as it is instantiated only once.
"""

_greet = "Hello, I am a Singleton"

def greet():
    print(_greet)

