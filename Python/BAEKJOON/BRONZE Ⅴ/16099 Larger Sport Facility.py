for _ in range(int(input())):
    lv, wv, le, we = map(int, input().split())
    if(lv * wv == le * we) : print("Tie")
    elif(lv * wv > le * we): print("TelecomParisTech")
    else: print("Eurecom")