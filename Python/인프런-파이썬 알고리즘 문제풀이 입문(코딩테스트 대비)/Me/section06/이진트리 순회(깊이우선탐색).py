tree = {1 : [2, 3], 
 2 : [4, 5],
 3 : [6, 7],
 4 : [0, 0],
 5 : [0, 0],
 6 : [0, 0],
 7 : [0, 0]}


def preorder(node):
    print(node, end= ' ')
    a, b = tree[node]
    if a:
        preorder(a)
    if b:
        preorder(b)

def inorder(node):
    a, b = tree[node]
    if a:
        inorder(a)
    print(node, end= ' ')
    if b:
        inorder(b)

def postorder(node):
    a, b = tree[node]
    if a:
        postorder(a)
    if b:
        postorder(b)
    print(node, end= ' ')

preorder(1)
print()
inorder(1)
print()
postorder(1)