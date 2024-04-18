package Practice_Codes;

import java.util.Arrays;

public class Remove_Duplicate_Int_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {9,8,9,3,2,3,4,2,1};
		Arrays.sort(input);
		int j = 0;
		for(int i = 0;i<input.length-1;i++) {
			if(input[i]!=input[i+1]) {
				input[j++]=input[i];
			}
		}
		input[j++] = input[input.length-1];
		
		for(int i=0;i<j;i++) {
			System.out.println(input[i]);
		}
	}

}
