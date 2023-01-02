import sys
sys.setrecursionlimit(10**9)

def order(in_start, in_end, post_start, post_end):
    rootnode = postorder[post_end]
    root_index = location[rootnode]
    left_size = root_index - in_start
    
    if in_start > in_end or post_start > post_end:
        return
    
    preorder.append(rootnode)   
    order(in_start, root_index - 1, post_start, post_start + left_size - 1 )
    order(root_index + 1, in_end, post_start + left_size, post_end - 1)
    
n = int(input())
inorder = list(map(int, input().split()))
postorder = list(map(int, input().split()))
location = [0] * (n + 1)
for i in range(n):
    location[inorder[i]] = i
preorder = []
order(0, n - 1, 0, n - 1)
print(' '.join(map(str, preorder)))