package Practice_Codes;
import java.util.*;
public class ratios_of_pos_neg_zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-4,3,-9,0,4,1};
		int pos = 0;
        int neg = 0;
        int zer = 0;
        float a = 0;
        float b = 0;
        float c = 0;
        for(int i:arr){
            if(i==0){
                zer++;
            }else if(i>0){
                pos++;
            }else if(i<0){
                neg++;
            }
        }
        a = pos/arr.length;
        b = neg/arr.length;
        c = zer/arr.length;
        System.out.format("%.6f%n", (float)pos/arr.length);
        System.out.println(b);
        System.out.println(c);

	}

}
