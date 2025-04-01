package Level1;

/**
 * 동영상 재생기
 * https://school.programmers.co.kr/learn/courses/30/lessons/340213
 * 문제유형: 구현
 * console.log(solution("34:33", "13:00", "00:55", "02:55", ["next", "prev"]))
 * console.log(solution("10:55", "00:05", "00:15", "06:55", ["prev", "next", "next"]))
 * console.log(solution("07:22", "04:05", "00:15", "04:07", ["next"]))
 */
public class Number340213 {

    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoLen = timeToNumber(video_len);
        int opStart = timeToNumber(op_start);
        int opEnd = timeToNumber(op_end);
        int now = timeToNumber(pos);

        for(String command : commands) {
            // 현재 재생 시간이 오프닝일때 오프닝 끝으로 이상
            if(opStart <= now && now <= opEnd) {
                now = opEnd;
            }
            switch (command){
                case "prev": // 10초전
                    // 10초 전으로  이동하거나 재생 시작점 이동
                    now = Math.max(now - 10, 0);
                    break;
                case "next": // 10초후
                    // 10초 이후로 이동이거나 재생 끝으로 이동
                    now = Math.min(now + 10, videoLen);
                    break;
            }
        }

        // 입력후에 오프닝 시간안에 포함 되어 있으면 오프닝 끝으로 이동
        if(opStart <= now && now <= opEnd) {
            now = opEnd;
        }

        // 정수를 시간으로 변환
        return  String.format("%02d:%02d", now / 60, now % 60);
    }

    // 시간을 정수로 변환
    private int timeToNumber(String time){
        String[] timeSplit = time.split(":");
        int minutes = Integer.parseInt(timeSplit[0]);
        int second = Integer.parseInt(timeSplit[1]);
        return minutes * 60 + second;
    }


    public static void main(String[] args) {
        Number340213 obj = new Number340213();
        String[] commands = new String[]{"next", "prev"};
        System.out.println(obj.solution("34:33", "13:00", "00:55", "02:55", commands));
        commands = new String[]{"prev", "next", "next"};
        System.out.println(obj.solution("10:55", "00:05", "00:15", "06:55", commands));
        commands = new String[]{"next"};
        System.out.println(obj.solution("07:22", "04:05", "00:15", "04:07", commands));
    }
}
