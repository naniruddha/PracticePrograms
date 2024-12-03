import java.util.*;
public class roman2int {
	public static void main(String[] args) {
		String roman = "MCMXCIV";
		
		HashMap<Character, Integer> romap = new HashMap<>();
		
		romap.put('I', 1);
		romap.put('V', 5);
		romap.put('X', 10);
		romap.put('L', 50);
		romap.put('C', 100);
		romap.put('D', 500);
		romap.put('M', 1000);
		
		int total = 0;
		int prevValue = 0;
		
		for(int i=roman.length()-1;i>=0;i--) {
			char c = roman.charAt(i);
			
			int currValue = romap.get(c);
			
			if(currValue<prevValue) {
				total -= currValue;
			}else {
				total += currValue;
			}
			
			prevValue = currValue;
		}
		
		System.out.println(total);
	}
}
