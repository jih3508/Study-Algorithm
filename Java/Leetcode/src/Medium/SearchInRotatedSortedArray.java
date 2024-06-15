package Medium;

public class SearchInRotatedSortedArray {

	public int search(int[] nums, int target) {

		int start = 0;
        int end = nums.length - 1;
        int mid;

        while(start <= end){
            mid = (start + end) / 2;
            System.out.println("start: " + start);
            System.out.println("end: " + end);
            System.out.println("mid: " + mid);
            if(nums[mid] == target) return mid;
            else if(target > nums[mid]){
                if(target > nums[end]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target < nums[start]){
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
		
		int[] nums = {4,5,6,7,8,1,2,3};
		
		System.out.println(solution.search(nums, 8));
		

	}

}
