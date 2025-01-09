package Medium;

public class MaximumPossibleNumberByBinaryConcatenation {

    int[] nums;
    public int maxGoodNumber(int[] nums) {

        this.nums = nums;

        // 0, 1, 2의 모든 순열에 대해 binaryConcatenation 값을 계산하고, 최댓값을 구함
        int maxValue = binaryConcatenation(0, 1, 2);
        maxValue = Math.max(maxValue, binaryConcatenation(0, 1, 2));
        maxValue = Math.max(maxValue, binaryConcatenation(0, 2, 1));
        maxValue = Math.max(maxValue, binaryConcatenation(1, 0, 2));
        maxValue = Math.max(maxValue, binaryConcatenation(1, 2, 0));
        maxValue = Math.max(maxValue, binaryConcatenation(2, 0, 1));
        maxValue = Math.max(maxValue, binaryConcatenation(2, 1, 0));

        return maxValue;
    }

    // 세 숫자의 인덱스를 받아 바이너리 문자열로 연결한 후 10진수 값으로 변환하는 메서드
    public int binaryConcatenation(int a1, int a2, int a3){

        StringBuilder binary = new StringBuilder();
        binary.append(Integer.toBinaryString(nums[a1]));
        binary.append(Integer.toBinaryString(nums[a2]));
        binary.append(Integer.toBinaryString(nums[a3]));

        return Integer.parseInt(binary.toString(), 2);  // 이진수 문자열을 10진수로 변환하여 반환
    }


    public static void main(String[] args) {
        MaximumPossibleNumberByBinaryConcatenation obj = new MaximumPossibleNumberByBinaryConcatenation();
        int[] nums = new int[] {1,2,3};
        System.out.println(obj.maxGoodNumber(nums));
        nums = new int[] {2,8,16};
        System.out.println(obj.maxGoodNumber(nums));
    }

}
