package Practice_Codes;

public class string_expansion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word ="a2b2cd2";
		String res = "";
		for(int i=0;i<word.length();i++) {
			if(i==word.length()-1 && !Character.isDigit(word.charAt(i))) {
				res = res+word.charAt(i);
				break;
			}else if(Character.isDigit(word.charAt(i+1))){
				int count = Character.getNumericValue(word.charAt(i+1));
				while(count>0) {
					res+=word.charAt(i);
					count--;
				}
				i++;
			}else {
				res = res+word.charAt(i);
			}
		}
		
		System.out.println(res);
	}

}
