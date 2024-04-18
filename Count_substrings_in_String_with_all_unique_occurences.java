package Practice_Codes;
import java.util.*;
public class Count_substrings_in_String_with_all_unique_occurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Count substring with atlesat one occurence of 'a','b','c'
				//in a given string
				//input : "aaacb";
				//output : "3"
				//"aaacb","aacb","acb"
		
		String word = "aaabc";
		List<String> words = new ArrayList<>();
		for(int i=0;i<word.length();i++) {
			for(int j=i+1;j<=word.length();j++) {
				words.add(word.substring(i, j));
			}
		}
		
		int target = removeDuplicates(word).length();
		int count = 0;
		for(String w : words) {
			if(removeDuplicates(w).length() == target) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}
	
	public static String removeDuplicates(String word) {
		Set<Character> unq = new HashSet<>();
		String res = "";
		for(char i : word.toCharArray()) {
			if(unq.add(i)) {
				res+=i;
			}
		}
		return res;
	}

}
