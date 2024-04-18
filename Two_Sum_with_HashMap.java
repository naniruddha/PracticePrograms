package Practice_Codes;
import java.util.*;
public class Two_Sum_with_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,7,6,3};
		int target = 9;
		
		HashMap<Integer, Integer> map1 = new HashMap<>();
		List<Integer> res = new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			res = new ArrayList<>();
			int comp = target - nums[i];
			if(map1.containsKey(comp)) {
				res.add(comp);
				res.add(nums[i]);
				System.out.println(res);
			}
			map1.put(nums[i], i);
		}
	}

}
