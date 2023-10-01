import sys
from collections import deque
sys.stdin=open("./Me/section05/input.txt", "r")

N, M = map(int, input().split())
Patients = deque([(index, patient) for index, patient in enumerate(list(map(int, input().split())))])
count = 0

while Patients:
    patient = Patients.popleft()
    if patient[1] >= max(Patients, key=lambda x: x[1])[1]:
        count += 1
        if patient[0] == M:
            break
    else:
        Patients.append(patient)

print(count)


