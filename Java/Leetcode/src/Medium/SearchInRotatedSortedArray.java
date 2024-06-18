package Medium;

public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
        int left = 0; // 왼쪽
        int right = nums.length - 1; // 오른쪽
        int mid; // 중간

        // 이진탐색 시작
        while(left <= right){
            mid = (left + right) / 2; // 중간값 계산
            // 찾았을때 위치 반환
            if(nums[mid] == target) return mid;
            // 왼쪽 - 중간 정렬 되어있을때
            else if(nums[left] <= nums[mid]){
                // 왼쪽 - 중간안에 target이 있을 경우
                if(nums[left] <= target && target < nums[mid]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            // 중간 - 끝 정렬 되어있을때
            }else{
                // 중간 - 오른쪽 사이에 target이 있을경우
                if(nums[mid] < target && target <= nums[right]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();
        int[] nums = {4,5,6,7,0,1,2};
//        System.out.println(solution.search(nums, 0));
//        System.out.println(solution.search(nums, 3));
        nums = new int[] {1, 3};
//        System.out.println(solution.search(nums, 3));
        nums = new int[] {5, 1, 3};
//        System.out.println(solution.search(nums, 5));
        nums = new int[] {4,5,6,7,8,1,2,3};
        System.out.println(solution.search(nums, 8));
    }

}
