#  Basic Syntax

try:
    number = int(input("Enter a number: "))
    print(number)
except:
    print("Invalid Input")
print("************************************************")

# Catching Specific Exceptions
try:
    num = int(input("Enter a num: "))
    print(10/num)
except ValueError:
    print("Invalid Input")
except ZeroDivisionError:
    print("Cannot divide by zero")
print("************************************************")

# Using else and finally
try:
    x = int(input("Enter a number: "))
    result = 10 / x
except (ValueError, ZeroDivisionError) as e:
    print("Error:", e)
else:
    print("Result:", result)
finally:
    print("This always runs.")