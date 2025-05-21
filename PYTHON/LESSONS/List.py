# List collection of elements

nums = [25,12,36,95,14]
print(nums)

print(nums[0])

print(nums[4])

print(nums[2:])

print(nums[-1])

print(nums[-5])

names = ['Manqasana', 'Reabetose', 'Manko']
print(names)

values = [9.5, 'Manqasana', 25]
print(values)

mil = [nums, names]
print(mil)

nums.append(45)
print(nums)

nums.insert(2, 88)
print(nums)

nums.remove(14)
print(nums)

nums.pop(1)
print(nums)

nums.pop()
print(nums)

del nums[2:]
print(nums)

nums.extend([29,12,14,36])
print(nums)

print(min(nums))

print(max(nums))

print(sum(nums))

nums.sort()
print(nums)
