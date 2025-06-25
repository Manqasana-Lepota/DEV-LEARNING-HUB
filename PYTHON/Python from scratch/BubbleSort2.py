# Bubble Sort

def bubble_sort(array):
    n = len(array)
    for i in range(n):
        swapped = False
        for j in range(0, n-i-1):
            if array[j] < array[j + 1]:
                array[j], array[j + 1] = array[j + 1], array[j]
                swapped = True
        if swapped == False:
                    break
    return array
nums = [1, 2, 3, 4, 5, 6, 7, 8, 9]
sorted_nums = bubble_sort(nums)
print(sorted_nums)