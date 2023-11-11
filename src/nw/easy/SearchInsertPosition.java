package nw.easy;

/*
Given a sorted array of distinct integers and a target value, 
return the index if the target is found. 
If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4
 */
public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 3, 5, 7};
		int target = 6;
		System.out.println(targetIndex(nums, target));
	}
	
	public static int targetIndex(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		int curIn;
		if (target > nums[nums.length - 1]) {
			return nums.length;
		}
		while (true) {
			curIn = (low + high) / 2;
			if (target == nums[curIn]) {
				return curIn;
			} else if (low >= high) { 
				return curIn;
			} else {
				if (target > nums[curIn]) {
					low = low + 1;
					curIn = curIn + 1;
				} else {
					high = high - 1;
					curIn = curIn - 1;
				}
			}
		}
	}

}
