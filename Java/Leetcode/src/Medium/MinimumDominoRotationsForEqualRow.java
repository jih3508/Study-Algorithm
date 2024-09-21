package Medium;

public class MinimumDominoRotationsForEqualRow {

    final int INF = Integer.MAX_VALUE;

    public int minDominoRotations(int[] tops, int[] bottoms) {

        int result = INF;
        // top이나 bootop [0]번째 인덱스에서 다른거 하나 있으면 바꿀수 없는것이다.
        result = Math.min(result, changeCount(tops[0], tops, bottoms));
        result = Math.min(result, changeCount(tops[0], bottoms, tops));
        result = Math.min(result, changeCount(bottoms[0], tops, bottoms));
        result = Math.min(result, changeCount(bottoms[0], bottoms, tops));

        // 4가지 경우 다 아닐경우 -1로 반환
        return result == INF ? -1 : result;
    }

    public int changeCount(int value, int tops[], int bottoms[]){

        int length = tops.length;
        int count = 0;

        for (int i = 0; i < length; i++) {
            if(tops[i] != value){
                // 바꿀깞이 0번째 인덱스 값 같을 경우 바꾼다.
                if(bottoms[i] == value){
                    count++;
                } else  {
                    // 아니면 그냥 바꾼다.
                    return INF;
                }

            }
        }
        return count;
    }



    public static void main(String[] args) {

        MinimumDominoRotationsForEqualRow obj = new MinimumDominoRotationsForEqualRow();

        int[] tops = {2,1,2,4,2,2};
        int[] bottoms = {5,2,6,2,3,2};
        System.out.println(obj.minDominoRotations(tops, bottoms));

        tops = new int[] {3,5,1,2,3};
        bottoms = new int[] {3,6,3,3,4};
        System.out.println(obj.minDominoRotations(tops, bottoms));

        tops = new int[] {1,2,2,1,2,1,2,1,2};
        bottoms = new int[] {1,2,1,1,1,1,2,1,2};
        System.out.println(obj.minDominoRotations(tops, bottoms));
    }
}
