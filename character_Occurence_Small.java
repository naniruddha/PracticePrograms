package Practice_Codes;
import java.util.*;
public class character_Occurence_Small {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "niharaniruddha";
		HashMap<Character,Integer> map1 = new HashMap<>();
		for(int i = 0;i<word.length();i++) {
			map1.put(word.charAt(i),map1.getOrDefault(word.charAt(i), 0)+1);
		}
		System.out.println(map1);
	}

}
