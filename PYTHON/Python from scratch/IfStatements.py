#  Basic if Statement
age = 18

if age >= 18:
    print("You are an adult.")

# if-else Statement
age = int(input("Enter your age: "))
if age>=18:
    print("You are an adult")
else:
    print("You are a minor")

# if-elif-else Statement
score = int(input("Enter your score: "))
if score >= 90:
    print("Grade: A")
elif score >= 80:
    print("Grade: B")
elif score >= 70:
    print("Grade: C")
elif score >= 60:
    print("Grade: D")
else:
    print("Fail")