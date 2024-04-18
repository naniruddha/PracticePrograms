package Practice_Codes;

public class super_Reduced_String {

	public static void main(String[] args) {
//		Reduce a string of lowercase characters in range ascii[‘a’..’z’]by doing a series of operations. In each operation, select a pair of adjacent letters that match, and delete them.
//
//		Delete as many characters as possible using this method and return the resulting string. If the final string is empty, return Empty String
//
//		Example.
//
//
//		aab shortens to b in one operation: remove the adjacent a characters.
//
//
//		Remove the two 'b' characters leaving 'aa'. Remove the two 'a' characters to leave ''. Return 'Empty String'.
		
		String s = "baab";
		String result = s;
		int count  = s.length();
		while(result != "Empty String" && count > 0) {
			result = superReducedString(result);
			count--;
		}
		
		System.out.println(result);
	}
	
	public static String superReducedString(String s) {
		String res = "";
		for(int i = 0;i<s.length();i++) {
			int count = 1;
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i) == s.charAt(j)) {
					count++;
				}else {
					break;
				}
			}
			int times = count % 2;
			while(times != 0) {
				res+=s.charAt(i);
				times--;
			}
			i = i + count -1;
		}
		
		if(res == "") {
			return "Empty String";
			}else {
				return res;
			}
	}

}
