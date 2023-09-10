N = int(input())
N_list = list(map(int, input().split()))
M = int(input())
M_list = list(map(int, input().split()))
N_list.extend(M_list)

result_list = sorted(set(N_list))

print(' '.join(map(str, result_list)))
