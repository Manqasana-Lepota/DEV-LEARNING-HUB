# Insertion Sort

def insertion_sort(arr):
    for i in range(1, len(arr)):
        key = arr[i]
        j = i-1
        while j>=0 and arr[j] < key:
            arr[j + 1] = arr[j]
            j-=1
            arr[j + 1] = key
    return arr
nums = [8,4,7,2,9,3,1]
sorted_nums = insertion_sort(nums)
print(f"Sorted Numbers: {sorted_nums}")