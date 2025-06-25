# Bubble Sort

def bubble_sort(arr):
    n = len(arr)
    for q in range(n):
        for r in range(0, n-q-1):
            if arr[r] > arr[r + 1]:
                arr[r], arr[r + 1] = arr[r +1], arr[r]
    return arr

nums = [5,3,9,1,2,8,6,7]
sortedItems = bubble_sort(nums)
print("Soterd Items " + str(sortedItems))
print(f"Sorted Items: {sortedItems}")