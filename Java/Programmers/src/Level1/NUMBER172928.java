package Level1;

import java.util.Arrays;

public class NUMBER172928 {

    public int[] solution(String[] park, String[] routes) {
        int row = park.length; // 공원의 세로 길이
        int col = park[0].length(); // 공원의 가로 길이

        int x = 0; // 시작 위치의 행 좌표
        int y = 0; // 시작 위치의 열 좌표

        /*
         * 시작 위치 찾기
         */
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // 'S'가 있는 위치를 찾으면 x, y 저장 후 반복문 종료
                if (park[i].charAt(j) == 'S') {
                    x = i;
                    y = j;
                    break;
                }
            }
        }

        // 이동 경로를 하나씩 처리
        for (String route : routes) {
            String[] data = route.split(" ");
            String op = data[0]; // 이동 방향 (N, S, W, E)
            int move = Integer.parseInt(data[1]); // 이동 거리

            // 이동할 위치를 계산하기 위한 변수 초기화
            int fx = x;
            int fy = y;
            boolean isMove = true; // 이동 가능 여부 체크

            // 이동 거리만큼 반복
            for (int i = 0; i < move; i++) {
                switch (op) {
                    case "N" -> fx -= 1; // 북쪽 이동 (행 감소)
                    case "S" -> fx += 1; // 남쪽 이동 (행 증가)
                    case "W" -> fy -= 1; // 서쪽 이동 (열 감소)
                    case "E" -> fy += 1; // 동쪽 이동 (열 증가)
                }

                // 공원의 범위를 벗어나거나 장애물('X')을 만난 경우 이동 불가능 처리
                if ((0 > fx || fx >= row || 0 > fy || fy >= col)
                        || park[fx].charAt(fy) == 'X') {
                    isMove = false;
                    break;
                }
            }

            // 이동 가능할 경우 새로운 위치를 현재 위치로 업데이트
            if (isMove) {
                x = fx;
                y = fy;
            }
        }

        // 최종 위치 반환
        return new int[] {x, y};
    }

    public static void main(String[] args) {

        NUMBER172928 solution = new NUMBER172928();

        String[] park = new String[]{"SOO","OOO","OOO"};
        String[] routes = new String[]{"E 2","S 2","W 1"};

        System.out.println(Arrays.toString(solution.solution(park, routes)));

        park = new String[]{"SOO","OXX","OOO"};
        routes = new String[]{"E 2","S 2","W 1"};

        System.out.println(Arrays.toString(solution.solution(park, routes)));

        park = new String[]{"OSO","OOO","OXO","OOO"};
        routes = new String[]{"E 2","S 3","W 1"};

        System.out.println(Arrays.toString(solution.solution(park, routes)));
    }
}
