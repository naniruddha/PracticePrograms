package Practice_Codes;
import java.util.*;
public class min_max_sum_elements_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<>();
		List<Long> res = new ArrayList<>();
		arr.add(5);
		arr.add(5);
		arr.add(5);
		arr.add(5);
		arr.add(5);
		System.out.println(res.get(1));
		for(int i=0;i<arr.size();i++){
            long count = 0;
            for(int j=0;j<arr.size();j++){
                if(i!=j){
                    count = count + res.get(j);
                }
            }
            res.add(count);
        }
        
        long a = Collections.max(res);
        long b = Collections.min(res);
        System.out.println(b+" "+a);
        
	}

}
