package nw.easy;

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
