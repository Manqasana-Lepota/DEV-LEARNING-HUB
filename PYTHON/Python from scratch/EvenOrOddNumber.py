# Even or Odd Number
# Write a function that returns "Even" if a number is even, and "Odd" if it's odd

def even_or_odd(num):
    return "Even" if num % 2 == 0 else "Odd"

print(even_or_odd(3))
print("**********************************************")

num = int(input("Enter a number:"))
if num % 2 == 0:
    print("EVEN")
else:
    print("ODD")