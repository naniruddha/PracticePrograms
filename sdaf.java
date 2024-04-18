package Practice_Codes;
import java.util.*;
public class sdaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n1 = "abc";
		String n2 = "abcbacb";
		List<String> l = new ArrayList<>();
		for(int i=0;i<=n2.length();i++) {
			for(int j=i+1;j<=n2.length();j++) {
				l.add(n2.substring(i,j));
			}
		}
		int count = 0;
		for(String s : l) {
			if(s.contains(n1)) {
				count++;
			}
		}
		System.out.println(l);
		System.out.println(count);
	}

}
