package Practice_Codes;
import java.util.*;
public class Anagram_with_Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String w = "nihar";
		String q = "rsahin";
		
		HashMap<Character, Integer> map1 = new HashMap<>();
		for(char i : w.toCharArray()) {
			map1.put(i, map1.getOrDefault(i, 0)+1);
		}
		
		for(char j : q.toCharArray()) {
			map1.put(j, map1.getOrDefault(j, 0)-1);
			
		}
		boolean flag = true;
		Collection<Integer> vals= map1.values();
		for(int i : vals) {
			if(i != 0) {
				flag = false;
			}
		}
		
		if(flag) {
			System.out.println("The strings are anagarms");
		}else {
			System.out.println("The string are not anagrams");
		}
	}

}
