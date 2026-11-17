package Easy;

import java.util.Arrays;

public class MoveZeroes {

    public int[] moveZeroes(int[] nums) {

        // index: 다음 0 아닌 수를 놓을 자리. 지금까지 모은 0 아닌 수의 개수와 같다.
        int index = 0;

        // 같은 배열을 읽으면서 쓰지만 안전하다.
        // index는 항상 지금 읽는 위치보다 같거나 작아서, 아직 안 읽은 값을 덮어쓰지 않는다.
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }

        // 앞에서 옮긴 값의 원래 자리에 옛 값이 남아 있으므로 뒤쪽을 0으로 다시 채운다.
        // 0 아닌 수의 개수만큼 앞이 채워졌으니, 남은 칸 수는 원래 0의 개수와 같다.
        while (index < nums.length) {
            nums[index++] = 0;
        }

        return nums;
    }

    public static void main(String[] args) {
        MoveZeroes solution = new MoveZeroes();

        System.out.println(Arrays.toString(solution.moveZeroes(new int[]{0, 1, 0, 3, 12})));
        System.out.println(Arrays.toString(solution.moveZeroes(new int[]{0})));

    }
}
