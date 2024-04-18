package Practice_Codes;
import java.util.*;
public class Length_of_Longest_Substring_without_repeating_characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "qabcdeabca";
		List<Character> charSet = new ArrayList<>();
		int result = 0;
		int l = 0;
		
		for(int i=0;i<word.length();i++) {
			while(charSet.contains(word.charAt(i))) {
				charSet.remove(0);
				l+=1;
			}
			charSet.add(word.charAt(i));
			result = Math.max(result, i - l + 1);
			
		}
		
		System.out.println(result);
	}

}
