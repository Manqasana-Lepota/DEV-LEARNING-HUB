# For Loop

print("****************Printing the for loop****************")

x = ['Manqasana', 65, 2.5]

for i in x:
    print(i)


print("***********Printing 10 numbers from 0-9****************")

for j in range(10):
    print(j)


print("#****************Printing numbers in Asceding order******************#")

for a in range(10,30,2):
    print(a)


print('#***********Printin numbers in descending order*************#')

for b in range(30, 10, -1):
    print(b)

print("***********Printing the numbers which is not divisible with 5********************")

for c in range(1,21):
    if(c%5!=0):
        print(c)

