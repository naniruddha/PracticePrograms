package Practice_Codes;
import java.util.*;
public class Group_Anagram_With_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(groupAnagram(input));
	}
	
	public static List<List<String>> groupAnagram(String[] input){
		List<List<String>> result = new ArrayList<>();
		HashMap<String, List<String>> anagramMap = new HashMap<>();
		for(String s : input) {
			String sortedString = sortString(s);
			if(!anagramMap.containsKey(sortedString)) {
				anagramMap.put(sortedString, new ArrayList<>());
			}
			anagramMap.get(sortedString).add(s);
		}
		result.addAll(anagramMap.values());
		return result;
	}
	public static String sortString(String word) {
		char[] chars = word.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}
	
}
