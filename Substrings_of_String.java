package Practice_Codes;
import java.util.*;
public class Substrings_of_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "nihar";
		List<String> res = new ArrayList<>();
		for(int i=0;i<word.length();i++) {
			for(int j=i+1;j<=word.length();j++) {
				String re ="";
				for(int k=i;k<j;k++) {
					re+=word.charAt(k);
				}
				res.add(re);
			}
		}
		System.out.println(res);
	}

}
