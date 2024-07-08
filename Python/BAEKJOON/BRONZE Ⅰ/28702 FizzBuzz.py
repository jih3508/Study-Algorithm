FizzBuzz = [input() for _ in range(3)]

for i in range(3):
    if FizzBuzz[i].isdigit():
        num = int(FizzBuzz[i]) + 3 - i
        if num % 5 == 0 and num % 3 == 0:
            print("FizzBuzz")
        elif num % 3 == 0:
            print("Fizz")
        elif num % 5 == 0:
            print("Buzz")
        else:
            print(num)
        break
