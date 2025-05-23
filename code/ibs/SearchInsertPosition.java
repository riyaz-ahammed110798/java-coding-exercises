package code.ibs;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class SearchInsertPosition {
    static int searchInsert(int[] nums, int target) {
        if(target > nums[nums.length - 1])
            return nums.length;
        else{
            int index = 0;
            for (int i = 0; i < nums.length; i++){
                if(nums[i] == target)
                    index = i;
                else if(target > nums[i] && target < nums[i + 1])
                    index = i + 1;
            }
            return index;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,4,5};
        System.out.print(searchInsert(nums, 7));
    }
}
