def solution(friends, gifts):

    friend_size = len(friends)
    friend_index = {friend: idx for idx, friend in enumerate(friends)}  # 친구 index 위치
    gift_count = [0] * friend_size # 선물지수
    gift_table = [[0] * friend_size for _ in range(friend_size)]

    for gift in gifts:
        friend1, friend2 = gift.split()

        # 선물 지수
        gift_count[friend_index[friend1]] += 1
        gift_count[friend_index[friend2]] -= 1

        # 준 선물 카운터 증가
        gift_table[friend_index[friend1]][friend_index[friend2]] += 1

    count = [0 for _ in range(friend_size)] # 다음달 받아야 될 선물 개수
    for i in range(friend_size - 1):
        for j in range(i + 1, friend_size):

            # 조건1 둘중 선물 많이 준 쪽이 받는다.
            if gift_table[i][j] > gift_table[j][i]:
                count[i] += 1
            elif gift_table[i][j] < gift_table[j][i]:
                count[j] += 1
            else:
                # 조건 2 둘 중 선물 지수가 높은 쪽이 받는다.
                if gift_count[i] > gift_count[j]:
                    count[i] += 1
                elif gift_count[i] < gift_count[j]:
                    count[j] += 1

    return max(count)


friends = ["muzi", "ryan", "frodo", "neo"]
gifts = ["muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"]
print(solution(friends, gifts))

friends = ["joy", "brad", "alessandro", "conan", "david"]
gifts = ["alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"]
print(solution(friends, gifts))

friends = ["a", "b", "c"]
gifts = ["a b", "b a", "c a", "a c", "a c", "c a"]
print(solution(friends, gifts))
