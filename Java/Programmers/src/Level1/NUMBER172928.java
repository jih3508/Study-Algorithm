package Level1;

import java.util.Arrays;

public class NUMBER172928 {

    public int[] solution(String[] park, String[] routes) {
        int row = park.length; // 세로 길이
        int col = park[0].length(); // 가로 길이

        int x = 0;
        int y = 0;

        /*
         *  시작 위치 찾기
         */
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <col ; j++) {
                // 시작 위치 찾으면 x, y 찾기
                if(park[i].charAt(j) == 'S'){
                    x = i;
                    y = j;
                    break;
                }
            }
        }

        for(String route : routes){
            String[] data = route.split(" ");
            String op = data[0];
            // 움이직는 이동 거리
            int move = Integer.parseInt(data[1]);
            // 이동할 위치 찾기
            int fx = x;
            int fy = y;
            boolean isMove = true;
            for (int i = 0; i < move; i++) {
                switch (op){
                    case "N" -> fx -= 1;
                    case "S" -> fx += 1;
                    case "W" -> fy -= 1;
                    case "E" -> fy += 1;
                }

                // 범위가 벗어날 경우,
                if((0 > fx || fx >= row || 0 > fy || fy >= col )
                        || park[fx].charAt(fy) == 'X'){
                    isMove = false;
                    break;
                }
            }

            // 이동 여부 확인
            if(isMove){
                x = fx;
                y = fy;
            }
        }

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
