package Practice_Codes;
import java.util.*;
public class isomorphic_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "adddd";
		String word2 = "egg";
		if(isIsomorphic(word1,word2)) {
			System.out.println("Strings are isomorphic");
		}else {
			System.out.println("Strings are not isomorphic");
		}
		
	}
	
	public static boolean isIsomorphic(String word1, String word2) {
		
		HashMap<Character, Character> map1 = new HashMap<>();
		HashMap<Character, Character> map2 = new HashMap<>();
		boolean flag = true;
		if(word1.length() == word2.length()) {
			for(int i = 0;i<word1.length();i++) {
				char c1 = word1.charAt(i);
				char c2 = word2.charAt(i);
				
				if(map1.containsKey(c1)) {
					if(map1.get(c1) != c2) {
						flag = false;
					}
				}else {
					map1.put(c1, c2);
				}
				
				if(map2.containsKey(c2)) {
					if(map2.get(c2) != c1) {
						flag = false;
					}
				}else {
					map2.put(c2, c1);
				}
				//map1.put(c1, c2);
			}
		}else {
			return false;
		}
		return flag;
	}

}
