num = int(input("Check if the number is prime number:"))

for x in range (2, num):
    if num % x == 0:
        print("Not Prime")
        break
else:
    print("Prime")