package Practice_Codes;
import java.util.*;
public class TwoSum_Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "absdevbg";
		char target = 'e';
		Set<Character> charSet = new HashSet<>();
		char[] c = s.toCharArray();
		for(char i:c) {
			char comp = (char)(target-i+96);
			if(charSet.contains(comp)) {
				System.out.println("The letters are: "+comp+" & "+i);
			}
			charSet.add(i);
		}
	}

}
