
public class notesDenomination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] denom = {500,100,50,20,5,1};
		int curr = 696;
		for(int d : denom) {
			if(curr>=d) {
				int count = curr/d;
				curr = curr%d;
				System.out.println("The denomination of "+d+" is:"+count);
			}
			
		}
	}

}
