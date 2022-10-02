def pow(n):
    if n == 1:
        return A % C
    else:
        result = pow(n // 2)
        if n % 2 == 1:
            return (result * result * A) % C
        else:
            return (result * result) % C

A, B, C = map(int, input().split())

print(pow(B))