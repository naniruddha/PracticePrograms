package Practice_Codes;
import java.util.*;
public class first_repeated_nonrepeated_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "niharaniruddha";
		HashMap<Character, Integer> map1 = new HashMap<>();
		for(char i : input.toCharArray()) {
			map1.put(i, map1.getOrDefault(i, 0)+1);
		}
		
		for(char j:input.toCharArray()) {
			if(map1.get(j)==1) {
				System.out.println("The first non-repeating character is:"+j);
				break;
			}
		}
		for(char j:input.toCharArray()) {
			if(map1.get(j)!=1) {
				System.out.println("The first repeating character is:"+j);
				break;
			}
		}
	}

}
