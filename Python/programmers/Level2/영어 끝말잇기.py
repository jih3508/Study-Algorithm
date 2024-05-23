def solution(n, words):
    answer = [0, 0]
    length = len(words)
    beforeWord = words[0]
    setWords = set({beforeWord})

    for i in range(1, length):
        nowWord = words[i]
        # 1. 끝말잇기 틀린 경우
        # 2. 이전단어 포함된 경우
        if(nowWord[0] != beforeWord[-1] or nowWord in setWords):
            answer[0], answer[1] = i % n + 1, i // n + 1
            break

        # 같을 경우 현재 단어를 이전단어로 옮긴다.
        setWords.add(nowWord)
        beforeWord = nowWord

    return answer

print(solution(3, ["tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"]))
print(solution(5, ["hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"]))
print(solution(2, ["hello", "one", "even", "never", "now", "world", "draw"]))