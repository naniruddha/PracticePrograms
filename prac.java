package Practice_Codes;
import java.util.*;
public class prac {

	public static void main(String[] args) {
	      int[] input = {1,2,3,5,3,6,2,5};
	      int k = 2;
	      List<Integer> result = new ArrayList<Integer>();
	      for(int i = k;i<input.length;i++) {
	    	  List<Integer> nums = new ArrayList<>();
	          for(int j=0;j<=k;j++){
	              nums.add(input[j]);
	          }
	          System.out.println(secondLargestNumber(nums));
	      }
	     }
	     public static int secondLargestNumber(List<Integer> nums){
	         int high = 0;
	         int secHigh = 0;
	         for(int i =0 ;i<nums.size();i++){
	             if(nums.get(i)>high){
	                 secHigh = high;
	                 high = nums.get(i);
	             }else if(nums.get(i)>secHigh && nums.get(i)!=high){
	                 secHigh = nums.get(i);
	             }
	         }
	         return secHigh;
	     }

}
