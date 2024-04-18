package Practice_Codes;

import java.util.Arrays;

public class Anagram_with_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String w = "aste";
		String q = "stea";
		
		char[] n1 = w.toCharArray();
		char[] n2 = q.toCharArray();
		
		Arrays.sort(n1);
		Arrays.sort(n2);
		
		if(Arrays.compare(n1, n2) == 0) {
			System.out.println("Strings are anagrams");
		}else {
			System.out.println("Strings are not anagrams");
		}
	}

}
