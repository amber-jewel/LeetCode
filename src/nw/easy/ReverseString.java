package nw.easy;

/*
Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.

Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 */
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"h","e","l","l","o"};
		String test = "";
		for (String t : s) {
			test += t;
		}
		char[] c = test.toCharArray();
		reverseString(c);
	}

	public static void reverseString(char[] s) {
		/*
        Stack<Character> chars = new Stack<>();
        for (char c : s) {
            chars.push(c);
        }
        while (!chars.isEmpty()) {
            for (int i = 0; i < s.length; i++) {
                s[i] = chars.pop();
            }
        }
        */
        for (int i = 0; i < s.length/2; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length -1 - i] = temp;
        }
        
        for (char c : s) {
        	System.out.print(c + " ");
        }
	}
}
