from monostate import Monostate

if __name__ == "__main__":
    print("***Demo: singleton pattern")
    print("Getting: reference to Singleton instance")
    import singleton
    x = singleton
    x.greet()
    print("Getting: another reference to Singleton instance")
    y = singleton
    y.greet()
    print("Checking: the two references point to the same object");
    if x is y:
        print("True")
    else:
        print("False")

    print("")

    print("***Demo: monostate pattern")
    print("Creating: first monostate")
    monostate1 = Monostate()
    print("Creating: second monostate")
    monostate2 = Monostate()
    print("Checking: state of first monostate")
    monostate1.greet()
    print("Checking: state of second monostate")
    monostate2.greet()    
    print("Checking: the two references point to the same object")
    if monostate1 is monostate2:
        print("True")
    else:
        print("False")
    print("Changing: state of monostate to ABC")
    monostate1.set_state({"state": "ABC"})    
    print("Checking: state of first monostate")
    monostate1.greet()
    print("Checking: state of second monostate")
    monostate2.greet()   