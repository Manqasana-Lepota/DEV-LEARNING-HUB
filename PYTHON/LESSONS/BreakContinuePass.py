# Break Continue Pass

print("******Using Break********")

availableCandies = 5

num = int(input("How many Candies do you want?"))

count = 1

while count <= num:
    if count > availableCandies:
        print('Out of stock')
        break

    print("Candy")
    count = count + 1

print("Good Bye")

print("********Using Continue******************")

for i in range(1, 101):
    if i % 3 ==0 or i % 5 ==0:
        continue

    print(i)
print("BYEEEEEEEEEEEEEEEEEE")

print("************Using Pass**************")

for x in range(1,101):
    if x%2!=0:
        pass
    else:
        print(x)
print("BYE")