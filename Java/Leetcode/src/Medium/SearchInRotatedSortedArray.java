package Medium;

public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
        int start = 0; // 왼쪽
        int end = nums.length - 1; // 오른쪽
        int mid; // 중간

        // 이분 탐색 시작
        while(start <= end){
            mid = (start + end) / 2;
            if(nums[mid] == target) return mid; // 값 찾으면 return

            // start - mid가 순서대로 정렬 되었을때
            else if(nums[start] <= nums[mid]){
                // start - mid 사이에 target 값이 있을 경우
                if(nums[start] <= target && target < nums[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
                // mid - end 순서대로 정렬 되었을때
            }else{
                //  mid - end 사이 값이 있을 경우
                if(nums[mid] < target && target <= nums[end]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
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
