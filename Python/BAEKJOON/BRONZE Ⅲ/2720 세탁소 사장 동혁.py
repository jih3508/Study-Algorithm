for _ in range(int(input())):
    C = int(input())

    quarter, C = divmod(C, 25)
    dime, C = divmod(C, 10)
    nickel, penny = divmod(C, 5)

    print("%d %d %d %d" % (quarter, dime, nickel, penny))