# Import two variables
print('Swapping without using temp')
a = 10
b = 20

a = a + b
b = a - b
a = a -b

print(a)
print(b)

print('Swapping using temp variable')
a = 5
b = 6

temp = a
a = b
b = temp

print(a)
print(b)

print('Swapping using stack')

a = 3
b= 4

a,b = b,a
print(a)
print(b)