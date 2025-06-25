# Quick sort

def quik_sort(arr):
    length = len(arr)
    if length <= 1:
        return arr
    else:
        pivot = arr.pop()

    greater = []
    lower= []
    for number in arr:
        if number > pivot:
            greater.append(number)
        else:
            lower.append(number)
    return quik_sort(lower) + [pivot] +quik_sort(greater)

print(quik_sort([9, 5, 8, 3, 7, 2, 6, 1]))

# Binary Search
def binary_search(arr, target): 
    low = 0
    high = len(arr) - 1

    while low <= high:
        mid = (low + high) // 2  # Calculate mid point
        
        # Check if target is present at mid
        if arr[mid] == target:
            return mid
        
        # If target is greater, ignore left half
        elif arr[mid] < target:
            low = mid + 1
        
        # If target is smaller, ignore right half
        else:
            high = mid - 1
    
    # Target is not present in array
    return -1

# Example usage:
arr = [1, 3, 5, 7, 9, 11, 13, 15]
target = 5
result = binary_search(arr, target)

if result != -1:
    print(f"Element {target} is present at index {result}.")
else:
    print(f"Element {target} is not present in the array.")


# Fibonacci
def fibonacci(n):
    fib = [0, 1]
    for i in range(2, n):
        next_number = fib[i - 1] + fib[i - 2]
        fib.append(next_number)
    return fib[:n]

print(fibonacci(10))

# Fibonacci Recursive

def fibonacci_recursive(n):
    if n <= 1:
        return n
    else:
        return fibonacci_recursive(n -1) + fibonacci_recursive(n - 2)

for i in range(10):
    print(fibonacci_recursive(i), end=" ")

    