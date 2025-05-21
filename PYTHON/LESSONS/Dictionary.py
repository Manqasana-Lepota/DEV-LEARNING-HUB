# Dictionary

data = {1: 'manqasana', 2: 'Manko', 3: 'Lusanda'}
print(data)

print(data[3])

print(data.get(1))

print(data.get(4, 'Not Found'))

Keys = ['Manko', 'Manqasana', 'Lusanda']
values = ['C#', 'Java', 'Python']

data = dict(zip(Keys, values))
print(data)

print(data['Manqasana'])

data['Reabetsoe'] = 'JavaScript'
print(data)

del data['Lusanda']
print(data)


Prog = {'JS': 'Atomm', 'CS': 'VS', 'Python': ['Pycharm', 'Sublime'], 'Java': {'JSE': 'Netbeans', 'JEE': 'Eclipse'}}
print(Prog)

print(Prog['JS'])

print(Prog['Python'])

print(Prog['Python'][1])

print(Prog['Java'])

print(Prog['Java']['JEE'])