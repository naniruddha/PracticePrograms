package Practice_Codes;

public class Two_Sum_simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,7,6,3};
		
		int target = 9;
		
		for(int i=0;i<nums.length;i++) {
			int comp = target - nums[i];
			for(int j = i+1;j<nums.length;j++) {
				if(comp == nums[j]) {
					System.out.println("The numbers are: "+nums[i]+" and "+comp);
				}
			}
			
		}
	}

}
