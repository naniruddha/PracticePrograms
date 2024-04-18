package Practice_Codes;
import java.util.*;
public class matrix_absolute_difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		List<List<Integer>> arr = new ArrayList<>();
		List<Integer> a1 = new ArrayList<>();
		a1.add(11);
		a1.add(2);
		a1.add(4);
		List<Integer> a2 = new ArrayList<>();
		a2.add(4);
		a2.add(5);
		a2.add(6);
		List<Integer> a3 = new ArrayList<>();
		a3.add(10);
		a3.add(8);
		a3.add(-12);
		arr.add(a1);
		arr.add(a2);
		arr.add(a3);

		
		
		int result1 = 0;
        int result2 = 0;
        int a = 0;
        int b = arr.size()-1;
        for(List<Integer> ar : arr) {
        	result1+=ar.get(a);
        	a++;
        	result2-=ar.get(b);
        	b--;
        }
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result1+result2);


	}

}
