/**
 * 동영상 재생기
 * https://school.programmers.co.kr/learn/courses/30/lessons/340213
 */
function solution(video_len, pos, op_start, op_end, commands) {

    // 시간을 정수로 변환 (mm::ss -> m * 60 + s)
    const timeToNumber = (time) =>{
        const [m, s] = time.split(":").map(Number);
        return m * 60 + s
    }

    // 정수를 시간으로 변환 (number -> mm:ss)
    const NumberToTime = (number) =>{
        const m = Math.floor(number/60);
        const s = number%60;
        return String(m).padStart(2, "0") + ":" + String(s).padStart(2, "0");
    }
    const videoLen = timeToNumber(video_len);
    const opStart = timeToNumber(op_start);
    const opEnd = timeToNumber(op_end);
    let now = timeToNumber(pos);

    commands.forEach(command => {
        // 현재 재생 시간이 오프닝일때 오프닝 끝으로 이상
        if (opStart <= now && now <= opEnd) {
            now = opEnd;
        }
        switch (command) {
            case "next": // 10초후
                // 10초후 이동히거나 재생 끝으로 이동
                now = Math.min(now + 10, videoLen);
                break;
            case "prev": // 10초전
                // 10초 전으로 이동하거나 재생 시작점 이동
                now = Math.max(now - 10, 0);
                break;
        }
    })

    // 입력후에 오프닝 시간안에 포함 되어 있으면 오프닝 끝으로 이동
    if (opStart <= now && now <= opEnd) {
        now = opEnd;
    }

    return NumberToTime(now);
}

console.log(solution("34:33", "13:00", "00:55", "02:55", ["next", "prev"]))
console.log(solution("10:55", "00:05", "00:15", "06:55", ["prev", "next", "next"]))
console.log(solution("07:22", "04:05", "00:15", "04:07", ["next"]))