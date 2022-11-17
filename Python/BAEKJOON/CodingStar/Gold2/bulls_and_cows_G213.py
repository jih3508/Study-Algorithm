def cb(a,b):
    bull,cow=0,0
    for i in range(4):
        if a[i] == b[i]: bull+=1
        elif a[i] in b: cow+=1
    return bull, cow    
    
a,b=input().split()
print('%d bull(s) and %d cow(s)'%cb(a,b))