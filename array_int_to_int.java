package Practice_Codes;

public class array_int_to_int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		int res = 0;
		for(int i=0;i<arr.length;i++) {
			res = res*10+arr[i];
		}
		System.out.println(res);
	}

}
