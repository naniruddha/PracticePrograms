package Practice_Codes;

public class check_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "1234a";
		int count = 0;
		for(char i : input.toCharArray()){
			if(i>'0' && i<'9') {
				count++;
			}
		}
		if(count == input.length()) {
			System.out.println("The string has only digits");
		}else {
			System.out.println("The string has more than digits");
		}
	}

}
