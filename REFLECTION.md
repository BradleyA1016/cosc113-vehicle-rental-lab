## Reflection

1. Why should the fields be private?
2. What happens if the Car constructor does not call super(...)?
3. What is the difference between this.type and super.type?

1. The fields should be private so the data being inputed can be verified.
2. If the car constructor doesn't call super the constructor cannot be called as constructors aren't inherited.
3. this.type refers to the method or constructor the variable is in within it's class. super.type refers to the parent's variable.
