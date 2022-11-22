change = 1000 - int(input())
count = 0
moneys = [500, 100, 50, 10, 5, 1]
for money in moneys:
    count += change // money
    change %= money

print(count)