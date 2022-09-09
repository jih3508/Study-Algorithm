import sys
input = sys.stdin.readline

def isPalindrome(r, l):
    global count, s
    count += 1
    if r >= l: return 1
    elif s[r] != s[l]: return 0
    return isPalindrome(r + 1, l - 1)
    
for _ in range(int(input())):
    count = 0
    s = input()
    print(isPalindrome(0, len(s) - 2), count)