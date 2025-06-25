# Creating Tuples

# Empty tuple
empty_tuple = ()

# Tuple with elements
my_tuple = (1, 2, 3)

# Tuple without parentheses (not recommended, but works)
another_tuple = 4, 5, 6

# Tuple with one item (requires a trailing comma)
single_item = (10,)

# Accessing Tuple Elements
my_tuple = (10, 20, 30)
print(my_tuple[0])   
print(my_tuple[-1])

# Tuple Operations
t1 = (1, 2)
t2 = (3, 4)
print(t1 + t2) # Concatination

print(t1 * 2) # Repetition

print(2 in t1) # Membership

# Tuple Packing and Unpacking
person = ("Alice", 25, "Engineer") # Packing
name, age, profession = person # Unpacking
print(name)       
print(age)        
print(profession) 

# Tuple Methods
t = (1, 2, 2, 3)
print(t.count(2))
print(t.index(3))