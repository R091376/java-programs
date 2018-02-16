import java.util.HashMap;
import java.util.Map;

public class CharFrequency {
	public static void main(String args[]) {
		System.out.println("Hello");
		//charFreqHashMap();
		//charFreqHashMap2();
		charFreqWithOutMap();
	}
	
	public static void charFreqHashMap() {
		String str = "abcdakdsab";
		System.out.println("Character frequncy for the string :"+str );
		HashMap<Character,Integer> map = new HashMap();
		for(int i=0; i < str.length(); i++) {
			char c = str.charAt(i);
			Integer val = map.get(c); 
			if(val == null) {
				map.put(c, 1);
			}else {
				map.put(c, val+1);
			}
		}
		printMap(map);
		
	}
	
	public static void printMap(HashMap<Character,Integer> map) {
		for(Map.Entry<Character,Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() +"-"+ entry.getValue());
		}
	}
	
	public static void charFreqHashMap2() {
		String str = "ababcsasd";
		System.out.println("Character frequncy for the string :"+str );
		HashMap<Character,Integer> map = new HashMap();
		for(char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		printMap(map);
	}
	
	public static void charFreqWithOutMap() {
		String str = "ababcsasd";
		System.out.println("Character frequncy for the string :"+str );
		int[] charFreq = new int[26];
		for(char ch : str.toCharArray()) {
			charFreq[ch-'a']++; 
		}
		for(int i=0; i < 26; i++) {
			char[] num = Character.toChars(97+i);
			System.out.println(num[0]+"-"+charFreq[i]);
		}
		
	}
}
