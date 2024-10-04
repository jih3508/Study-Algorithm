package Medium;

public class FrogJumpII {

    public int maxJump(int[] stones) {
        int size = stones.length;

        if(size < 3){
            return stones[1] - stones[0];
        }

        int maxValue = 0;

        for (int i = 2; i < size; i++) {
            maxValue = Math.max(maxValue, stones[i] - stones[i - 2]);
        }

        return maxValue;
    }

    public static void main(String[] args) {
        FrogJumpII obj = new FrogJumpII();
        int[] stones = {0,2,5,6,7};
        System.out.println(obj.maxJump(stones));

        stones = new int[] {0,3,9};
        System.out.println(obj.maxJump(stones));
    }
}
