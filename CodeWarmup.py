# Write a function that counts down from a user entered integer on separate lines. You must use a loop and you must validate input.
# Accidentally did them all in Python
def palindrome():
    pal= input("Enter a word to check if it is a palindrome:")
    print(pal == pal[::-1])
def math():
    num = input("Enter a number to add all the digits of:")
    print(sum([int(i) for i in (num)]))

# starts here
def counts():
    while True:
        try:
            num = input("Enter a number to count down from:") # Takes input to count down
            for counter in range(int(num),0,-1): # Counts from number entered to 0 incrementing by -1
                print(counter) 
            return num
        except ValueError: # input validation in the case of a value error
            print("Invalid input!")
   
palindrome(); math();counts(); #Run function
