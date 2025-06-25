# Binary Search

def binary_search(arr, target):
    begin = 0
    end = len(arr) - 1
    while begin <= end:
        mid = (begin + end) // 2
        if arr[mid] == target:
            return mid
        elif target < arr[mid]:
            end = mid -1
        else:
            begin = mid + 1
    return -1 

array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
target = 2
result = binary_search(array, target)
print(result)