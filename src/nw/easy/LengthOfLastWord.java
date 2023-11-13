package nw.easy;

/*
Given a string s consisting of words and spaces, 
return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.

Example 2:
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.

Example 3:
Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
 */
public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "  test  n nw  ";
		System.out.println(lengthOfLastWord(s));
	}
	
	public static int lengthOfLastWord(String s) {
		int count = 0;
		//System.out.println(s.length());
		for (int i = s.length() - 1; i >= 0; i--) {
			//System.out.println(s.charAt(i));
			if (s.charAt(i) == ' ') {
				continue;
			} else {
				count++;
				if (i > 0) {
					if (s.charAt(i - 1) == ' ') {
						break;
					}
				}
			}
		}
		return count;
	}

}
