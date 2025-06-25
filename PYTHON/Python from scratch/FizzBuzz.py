# Print numbers from 1 to 100
# For multiples of 3 print "Fizz", for 5 print "Buzz", for both print "FizzBuzz"

for num in range(1, 100):
    if num % 3 == 0 and num % 5 == 0:
        print("FizzBuzz")
    elif num % 3 == 0:
        print("Fizz")
    elif num % 5 == 0:
        print("Buzz")
    else:
        print(num)

'''
Write a program that prints the numbers from 1 to N.
But for multiples of 3, print "Fizz" instead of the number.
For multiples of 5, print "Buzz".
For numbers which are multiples of both 3 and 5, print "FizzBuzz".
'''

n = int(input("Enter a number: "))
for num in range(1, n + 1):
    if num % 3 == 0 and num % 5 == 0:
        print("FizzBuzz")
    elif num % 3 == 0:
        print("Fizz")
    elif num % 5 == 0:
        print("Buzz")
    else:
        print(num)



