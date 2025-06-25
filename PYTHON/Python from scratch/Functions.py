# Defining a Function

def greeting():
    print("Hello User")

greeting() # Method call


# Function with Parameters
def sayHi(name, age):
    print(f"Hello {name}!, You're {age} years old")

sayHi("Manqasana", 25)
sayHi("Reabetsoe", 15)

#  Function with Return Value
def add(a, b):
    return a+b

sum = add(3, 5)
print(sum)

def cube(num):
    return num*num*num

result = cube(4)
print(result)
