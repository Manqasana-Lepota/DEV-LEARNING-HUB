firstname = "Manqasana"
lastname = " Lepota"

# Concatination(Joining Strings)
fullname = firstname + lastname
print(fullname)

# Length of a String
print("The length of my fullname is: " +str(len(fullname)))

# Accessing Characters
print(fullname[0])
print(fullname[8])
print(fullname[-1])
print(fullname[-3])

# Slicing Strings
print(fullname[0:9])
print(fullname[11:])
print(fullname[4:12])

# String Methods
print(fullname.lower())
print(fullname.upper())
print(lastname.strip())
print(firstname.replace("Manqasana", "Gace"))
print(fullname.split(","))
print(lastname.find("t"))
print(firstname.startswith("M"))

# String Formatting

# f-Strings (recommended)
name = "Manqasana"
age = 25
print(f"My name is {name} and I am {age} years old")

# .format()
print("My name is {} and I am {} years old" .format(name, age))

# % formatting (older style)
print("My name is %s and I am %d years old" % (name, age))