package Practice_Codes;

public class Second_Largest_Number {

	public static void main(String[] args) {
		int[] numbers = {9,8,2,7,5};
		int highest = 0;
		int secHigh = 0;
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>highest) {
				secHigh = highest;
				highest = numbers[i];
			}else if(numbers[i]>secHigh && numbers[i]!=highest) {
				secHigh = numbers[i];
			}
		}
		
		System.out.println(secHigh);
	}

}
