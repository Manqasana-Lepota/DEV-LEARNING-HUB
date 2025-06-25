# Creating a List

numbers = [1, 2, 3, 4, 5]
names = ["Alice", "Bob", "Charlie", "Bob", "Jim"]
print(names)

# Common List Operations
names.append("Chad")
print(names)

names.insert(2, "Tom")
print(names)

print(names[3])

print(names.index("Jim"))

names.remove("Alice")
print(names)

names.pop(2)
print(names)

print(len(names))

numbers.sort()
print(numbers)

numbers.reverse()
print(numbers)

num = numbers.copy()
print(num)

numbers.clear()
print(numbers)

#  Looping Through a List
fruits = ["apple", "banana", "cherry"]
for fruit in fruits:
    print(fruit)