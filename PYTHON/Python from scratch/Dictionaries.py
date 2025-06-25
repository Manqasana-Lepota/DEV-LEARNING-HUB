# Creating a Dictionary

monthConversions = {
    "Jan": "January",
    "Feb": "February",
    "Mar": "March",
    "Apr": "April",
    "May": "May",
    "Jun": "June",
    "Jul": "July",
    "Aug": "August",
    "Sep": "September",
    "Oct": "October",
    "Nov": "November",
    "Dec": "December"
}
print(monthConversions)
print("******************************************************")

# Accessing Values
print(monthConversions["Apr"])
print(monthConversions.get("Sep"))
print(monthConversions.get("Sal", "Invalid month conversions"))
print("*******************************************************")

# Looping Through a Dictionary
for key in monthConversions:
    print(key)

print("*****************************************************")

for value in monthConversions.values():
    print(value)

print("*****************************************************")

for key, value in monthConversions.items():
    print(f"{key}: {value}")