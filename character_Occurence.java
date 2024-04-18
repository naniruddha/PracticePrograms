package Practice_Codes;
import java.util.*;
public class character_Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "niharaniruddha";
		HashMap<Character, Integer> map1 = new HashMap<>();
		
		for(int i=0;i<word.length();i++) {
			if(map1.containsKey(word.charAt(i))) {
				int count = map1.get(word.charAt(i));
				map1.put(word.charAt(i), ++count);
			}else {
				map1.put(word.charAt(i), 1);
			}
		}
		
		System.out.println(map1);
	}

}
