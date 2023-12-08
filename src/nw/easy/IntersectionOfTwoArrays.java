package nw.easy;

import java.util.HashSet;
import java.util.Set;

/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.

Constraints:

    1 <= nums1.length, nums2.length <= 1000
    0 <= nums1[i], nums2[i] <= 1000
 */
public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 4, 9, 5 };
		int[] nums2 = { 9, 4, 9, 8, 4 };
		int[] temp = intersection(nums1, nums2);
		for (int t : temp) {
			System.out.print(t + " ");
		}
	}

	public static int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> res1 = new HashSet<Integer>();
		Set<Integer> res2 = new HashSet<Integer>();
		/*
		 * // correct, but wrong logic for (int i = 0; i < nums1.length; i++) { for (int
		 * j = 0; j < nums2.length; j++) { if (nums1[i] == nums2[j]) {
		 * res1.add(nums1[i]); } } }
		 */
		for (int i : nums1) {
			res1.add(i);
		}
		for (int j : nums2) {
			if (res1.contains(j)) {
				res2.add(j);
			}
		}
		int[] get = new int[res2.size()];
		int i = 0;
		for (int t : res2) {
			get[i++] = t;
		}
		return get;
	}

}
