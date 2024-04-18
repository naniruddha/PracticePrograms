package Practice_Codes;

public class each_Character_Count_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "aaaAAA%bbBBBB*CCccaaa";
		String m = word.toLowerCase().replaceAll("[^a-zA-Z]", "");
		String result = "";
		int i = 0;
		while(i<m.length()) {
			int count = 0;
			for(int j=i;j<m.length();j++) {
				if(m.charAt(i)==m.charAt(j)) {
					count++;
					i=j;
				}else {
					break;
				}
			}
			result = result + m.charAt(i) +count;
			i++;
		}
		
		System.out.println(result);
	}

}
