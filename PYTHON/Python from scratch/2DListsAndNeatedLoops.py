# Creating a 2D List

number_grid = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9],
    [0]
]

# Accessing by Index
print(number_grid[0][0])
print(number_grid[2][1])

# Accessing Elements with Nested Loops
for row in number_grid:
    for col in row:
        print(col)
print("**********************************************************")

for row in number_grid:
    for col in row:
        print(col, end='  ')
    print()

print("************************************************************")
# Modifying Elements
number_grid[1][2] = 20
print(number_grid)

#  Sum All Elements
total = 0
for row in number_grid:
    for col in row:
        total += col
print("Sum = " + str(total))