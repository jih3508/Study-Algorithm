package Medium;

public class CountTripletsThatCanFormTwoArraysOfEqualXOR {

    public int countTriplets(int[] arr) {

        int size = arr.length;
        int[] prefixXor = new int[size + 1];
        prefixXor[1] = arr[0];

        // prefixXor[i]는 arr[0]부터 arr[i-1]까지의 XOR 연산 결과를 저장
        for (int i = 1; i < size ; i++) {
            prefixXor[i + 1] = prefixXor[i] ^ arr[i];
        }

        int count = 0;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                for (int k = j; k < size; k++) {
                    // arr[i]부터 arr[j-1]까지의 XOR 값과 arr[j]부터 arr[k]까지의 XOR 값이 같을 경우 카운트 증가
                    count += (prefixXor[j] ^ prefixXor[i]) == (prefixXor[k + 1] ^ prefixXor[j])? 1 : 0;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        CountTripletsThatCanFormTwoArraysOfEqualXOR obj = new CountTripletsThatCanFormTwoArraysOfEqualXOR();
        int[] arr = {2,3,1,6,7};
        System.out.println(obj.countTriplets(arr));

        arr = new int[]{1,1,1,1,1};
        System.out.println(obj.countTriplets(arr));
    }

}
