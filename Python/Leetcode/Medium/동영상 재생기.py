"""
- 동영상 재생기
- https://school.programmers.co.kr/learn/courses/30/lessons/340213
"""


def solution(video_len, pos, op_start, op_end, commands):
    # 시간을 정수로 변환 (mm::ss -> m * 60 + s)
    def timeToNumber(time: str):
        minutes, seconds = map(int, time.split(":"))
        return minutes * 60 + seconds

    video_len = timeToNumber(video_len)
    op_start = timeToNumber(op_start)
    op_end = timeToNumber(op_end)
    now = timeToNumber(pos)

    for command in commands:
        # 현재 재생 시간이 오프닝일때 오프닝 끝으로 이동
        if op_start <= now <= op_end:
            now = op_end
        if(command == "prev"): # 10초전
                # 10초 이후 이동하거나 재생 끝으로 이동
                now = max(now - 10, 0)
        elif(command == "next"): # 10초후
                # 10초 이전 이동하거나 재생 시작점 이동
                now = min(now + 10, video_len)

    if op_start <= now <= op_end:
        now = op_end

    # 정수를 시간으로 변환
    return "%02d:%02d" % (now // 60, now % 60)


print(solution("34:33", "13:00", "00:55", "02:55", ["next", "prev"]))
print(solution("10:55", "00:05", "00:15", "06:55", ["prev", "next", "next"]))
print(solution("07:22", "04:05", "00:15", "04:07", ["next"]))
