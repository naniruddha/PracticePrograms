package Practice_Codes;

public class right_aligned_staircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for(int i = 1;i<=n;i++){
            int j = 0;
            int k = n;
            while(i<k) {
            	System.out.print(' ');
            	k--;
            }
            while(i>j){
                System.out.print('#');
                j++;
            }
            System.out.println();
        }
    }
}


