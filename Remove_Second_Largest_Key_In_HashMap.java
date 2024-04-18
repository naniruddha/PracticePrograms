package Practice_Codes;
import java.util.*;
import java.util.Map.Entry;
public class Remove_Second_Largest_Key_In_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> map1 = new HashMap<>();
		map1.put('a', 9);
		map1.put('b', 8);
		map1.put('c', 2);
		map1.put('d', 7);
		map1.put('e', 5);
		
		List<Integer> nums = new ArrayList<>(map1.values());
		int high = 0;
		int secHigh = 0;
		for(int i=0;i<nums.size();i++) {
			if(nums.get(i)>high) {
				secHigh = high;
				high = nums.get(i);
			}else if(nums.get(i)>secHigh && nums.get(i)!=high) {
				secHigh = nums.get(i);
			}
		}
		char key = ' ';
		for(Entry<Character, Integer> entry : map1.entrySet()) {
			if(entry.getValue() == secHigh) {
				key = entry.getKey();
			}
		}
		
		map1.remove(key);
		
		System.out.println(map1);
	}

}
