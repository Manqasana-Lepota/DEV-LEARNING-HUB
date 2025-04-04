# None

"""
NUMERIC
# int, float, complex, bool """

# float
num = 2.5
print(type(num))

# int
num = 5
print(type(num))

# complex
num = 6 + 9j
print(type(num))

# float to int
a = 5.6
b = int(a)
print(type(b))

# int to float
k = float(b)
print(type(k))

k = 6
c = complex(b, k)
print(type(c))
print(c)

# bool
bool = b < k
print(type(bool))
print(bool)

print(b > k)

print(int(True))

print(int(False))

"""
SEQUENCE
# List, Tuple, Set, String, Range
"""

# List
list = [25,36,45,12]
print(type(list))

# Set
s = {23,34,36, 12, 45}
print(type(s))

# Tuple
t = (25, 36, 4, 57, 12)
print(type(t))

# String
str = 'Manqasana'
print(type(str))

# Range
print(range(10))

d = {'Manana': 'Nokia', 'Lele': 'Samsung', 'Kate': 'Motorola'}
print(d.keys())
print(d.values())
print(d['Manana'])
print(d.get('Lele'))