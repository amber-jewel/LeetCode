package nw.easy;

import java.util.Stack;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 
Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false
 */
public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = ")";
		System.out.println(valid(s));
	}

	public static boolean valid(String s) {
		Stack<Character> chars = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			switch (ch) {
				case '[':
				case '{':
				case '(':
					chars.push(ch);
					break;
				case ']':
				case '}':
				case ')':
					if (!chars.isEmpty()) {
						char c = chars.pop();
						if ((ch == ']' && c != '[') ||
							(ch == '}' && c != '{') ||
							(ch == ')' && c != '(')) {
							return false;
						} else {
							continue;
						}
					} else {
						return false;
					}
			}
		}
		if (!chars.isEmpty()) {
			return false;
		}
		return true;
	}
}
