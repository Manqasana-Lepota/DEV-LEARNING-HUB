# Reading Files

file = open("/home/manqasana/Desktop/PYTHON/Python from scratch/employees.txt", "r")
for employee in file.readlines():
    print(employee)

file.close()