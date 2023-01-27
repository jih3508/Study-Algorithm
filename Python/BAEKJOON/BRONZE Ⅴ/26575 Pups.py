for _ in range(int(input())):
    d, dogs, pounds = map(float, input().split())
    print("$%.2f"%(round(d * dogs * pounds, 2)))