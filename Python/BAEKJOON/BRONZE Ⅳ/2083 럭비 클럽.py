while(True):
    name, age, weight = input().split()
    age = int(age)
    weight = int(weight)
    if(name == "#" and age == 0 and weight == 0): break
    print(name, "Senior" if age > 17 or weight >= 80 else "Junior")