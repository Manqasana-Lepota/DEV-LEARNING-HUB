# Return True if a string is a palindrome (reads the same forward and backward).

def is_palidrome(s):
    return s == s[::-1]

print(is_palidrome(input("Enter a string: ")))