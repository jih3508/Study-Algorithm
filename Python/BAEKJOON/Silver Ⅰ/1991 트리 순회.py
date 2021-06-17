import sys

def preorder(node):
    if node != ".":
        print(node, end="")
        preorder(tree[node][0])
        preorder(tree[node][1])

def inorder(node):
    if node != ".":
        inorder(tree[node][0])
        print(node, end="")
        inorder(tree[node][1])

def postorder(node):
    if node != ".":
        postorder(tree[node][0])
        postorder(tree[node][1])
        print(node,end="")
    
input = sys.stdin.readline
tree = {}

for _ in range(int(input())):
    arr = input().split()
    tree[arr.pop(0)] = arr

preorder("A")
print("\n", end= "")
inorder("A")
print("\n", end= "")
postorder("A")