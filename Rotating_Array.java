package Practice_Codes;

public class Rotating_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5};
		int t = 3;
		
		while(t>0) {
			int[] rotatedNums = new int[nums.length];
			int j = 1;
			for(int i=0;i<nums.length;i++) {
				if(i == nums.length-1) {
					rotatedNums[0] = nums[i];
				}else {
					rotatedNums[j] = nums[i];
					j++;
				}
				
			}
			nums = rotatedNums;
			t--;
		}
		
		for(int i:nums) {
			System.out.println(i);
		}
		
	}

}
