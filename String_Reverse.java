package Practice_Codes;

public class String_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "rahin";
		String revName = "";
		for(int i=name.length()-1;i>=0;i--) {
			revName += name.charAt(i);
		}
		
		System.out.println(revName);
	}
	

}
