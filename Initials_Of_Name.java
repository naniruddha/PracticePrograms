package Practice_Codes;

public class Initials_Of_Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Hyder Chari Verma";
		String[] splits = name.split(" ");
		String res = "";
		for(int i=0;i<splits.length;i++) {
			if(i == splits.length-1) {
				res+=splits[i];
			}else {
				res+=(splits[i]).charAt(0);
				res+=".";
			}
		}
		
		System.out.println(res);
	}

}
