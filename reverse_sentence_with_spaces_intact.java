package Practice_Codes;

public class reverse_sentence_with_spaces_intact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sen = "India is my country";
		char[] words = sen.toCharArray();
		char[] result = new char[words.length];
		for(int i =0 ; i<words.length;i++) {
			if(words[i] == ' ') {
				result[i] = ' ';
			}
		}
		
		int j = words.length-1;
		for(int i =0 ;i<words.length;i++) {
			if(words[i] != ' ') {
				if(result[j] == ' ') {
					j--;
				}
				result[i] = words[j];
				j--;
			}
		}
		System.out.println(result);
	}

}
