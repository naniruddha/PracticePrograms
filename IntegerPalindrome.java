package Practice_Codes;

public class IntegerPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 54321;
		int rev = 0;
		while(input>0) {
			int lastDigit = input % 10;
			rev=rev*10+lastDigit;
			input = input/10;
		}
		
		System.out.println(rev);
	}

}
