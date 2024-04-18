package Practice_Codes;
import java.util.*;
public class mod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "abcabc";
		HashMap<Character, Integer> map1 = new HashMap<>();
		for(int i =0;i<name.length();i++) {
			map1.put(name.charAt(i), map1.getOrDefault(name.charAt(i), 0)+1);
		}
		List<Integer> values = new ArrayList<>(map1.values());
		int oddCount = 0;
		for(int v : values) {
			if(v%2!=0) {
				oddCount++;
			}
		}
		
		if(oddCount>1) {
			System.out.println("No palindrome possible");
		}else {
			System.out.println("Palindrome is possible");
		}
		System.out.println(map1);
		
	}

}
