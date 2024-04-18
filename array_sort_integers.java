package Practice_Codes;

public class array_sort_integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {69,2,77,22};
		for(int i = 0;i<input.length-1;i++) {
			for(int j = i+1;j<input.length;j++) {
				if(input[i]>input[j]) {
					int temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
		
		for(int k = 0;k<input.length;k++) {
			System.out.println(input[k]);
		}
	}	

}
