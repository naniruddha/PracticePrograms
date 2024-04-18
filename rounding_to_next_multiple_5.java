package Practice_Codes;
import java.util.*;
public class rounding_to_next_multiple_5 {

	public static void main(String[] args) {
		//HackerLand University has the following grading policy:

		//Every student receives a  in the inclusive range from  to .
		//Any  less than  is a failing grade.
		//Sam is a professor at the university and likes to round each student's  according to these rules:
		//
		//If the difference between the  and the next multiple of  is less than , round  up to the next multiple of .
		//If the value of  is less than , no rounding occurs as the result will still be a failing grade.
		//Examples
		//
		// round to  (85 - 84 is less than 3)
		// do not round (result is less than 40)
		// do not round (60 - 57 is 3 or higher)
		
		List<Integer> grades = new ArrayList<>();
		grades.add(73);
		grades.add(67);
		grades.add(38);
		grades.add(33);
		List<Integer> res = new ArrayList<>();
		for(int mark:grades) {
			int comp = 0;
			if(mark<38) {
				res.add(mark);
			}else {
				for(int i=mark;i<=100;i++) {
					if(i%5 == 0) {
						comp = i;
						break;
					}
				}
				if(comp - mark < 3) {
					res.add(comp);
				}else {
					res.add(mark);
				}
			}
		}
		
		System.out.println(res);
		
		
		
	}

}
