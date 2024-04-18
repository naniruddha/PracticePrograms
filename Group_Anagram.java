package Practice_Codes;
import java.util.*;
public class Group_Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] word = {"eat", "tea", "tan", "ate", "nat", "bat"};
		List<String> words = new ArrayList<String>();
		for(String i : word) {
			words.add(i);
		}
		List<List<String>> result = new ArrayList<>();
		for(int i = 0;i<words.size();i++) {
			List<String> w = new ArrayList<>();
			w.add(words.get(i));
			for(int j=i+1; j<words.size()-1;j++) {
				if(isAnagram(words.get(i),words.get(j))) {
					w.add(words.get(j));
					words.remove(j);
				}
			}
			result.add(w);	
		}
		System.out.println(result);
	}
	
	public static boolean isAnagram(String w, String q) {
		HashMap<Character, Integer> map1 = new HashMap<>();
		for(char i : w.toCharArray()) {
			map1.put(i, map1.getOrDefault(i, 0)+1);
		}
		
		for(char j : q.toCharArray()) {
			map1.put(j, map1.getOrDefault(j, 0)-1);
		}
		
		Collection<Integer> vals = map1.values();
		boolean flag = true;
		for(int i : vals) {
			if(i != 0) {
				flag = false;
			}
		}
		
		if(flag) {
			return flag;
		}else {
			return flag;
		}
	}

}
