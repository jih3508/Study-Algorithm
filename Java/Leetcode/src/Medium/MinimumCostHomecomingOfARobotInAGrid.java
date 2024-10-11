package Medium;

public class MinimumCostHomecomingOfARobotInAGrid {

    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        int x1 = startPos[0];
        int y1 = startPos[1];
        int x2 = homePos[0];
        int y2 = homePos[1];

        int result = 0; // 결과 저장 값

        // 처음 위치 x 좌표가 home x좌표 보다 작을때
        if(x1 < x2){
            for (int i = x1 + 1; i <= x2; i++) {
                result += rowCosts[i];
            }
        }else{

            for(int i = x2; i < x1; i++){
                result += rowCosts[i];
            }
        }

        // 처음 위치 y 좌표가 home y좌표 보다 작을때
        if(y1 < y2){
            for (int i = y1 + 1; i <= y2; i++) {
                result += colCosts[i];
            }
        }else{
            for (int i = y2; i < y1; i++) {
                result += colCosts[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        MinimumCostHomecomingOfARobotInAGrid obj = new MinimumCostHomecomingOfARobotInAGrid();
        int[] startPos = new int[] {1, 0};
        int[] homePos = new int[] {2, 3};
        int[] rowCosts = new int[] {5, 4, 3};
        int[] colCosts = new int[] {8, 2, 6, 7};
        System.out.println(obj.minCost(startPos, homePos, rowCosts, colCosts));

        startPos = new int[]{0, 0};
        homePos = new int[] {0, 0};
        rowCosts = new int[] {5};
        colCosts = new int[] {26};
        System.out.println(obj.minCost(startPos, homePos, rowCosts, colCosts));
    }
}
