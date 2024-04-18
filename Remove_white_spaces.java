package Practice_Codes;

public class Remove_white_spaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "nihar aniruddha";
		String newWord = word.replaceAll("\\s", "");
		System.out.println(newWord);
	}

}
