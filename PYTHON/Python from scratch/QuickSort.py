# Quick Sort

def quick_sort(arr):
    length = len(arr)
    if length <= 1:
        return arr
    else:
        pivot = arr.pop()
    
    nums_greater = []
    nums_lower = []
    for number in arr:
        if number > pivot:
            nums_greater.append(number)
        else:
            nums_lower.append(number)
    return quick_sort(nums_lower) + [pivot] + quick_sort(nums_greater)

print(quick_sort([4,9,6,3,8,1]))

