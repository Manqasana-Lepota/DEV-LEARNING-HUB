# Fibonacci

def fibonacci(n):
    fib = [0, 1]
    for x in range(2, n):
        next_number = fib[x - 1] + fib[x - 2]
        fib.append(next_number)
    return fib[:n]
    
print(fibonacci(20))

# Fibonacci using recursive