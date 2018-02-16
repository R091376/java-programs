/**
 * @author khasim
 *
 */


public class CharactersNeededToConvertToAnagrams {
	public static void main(String args[]) {
		String a = "abc";
		String b = "bcd";
		if(a.length() != b.length()) {
			System.out.println(-1);
		}else {
			int aArr[] = new int[26];
			int bArr[] = new int[26];
			for(int i=0;i<a.length();i++) {
				aArr[a.charAt(i)-97] = aArr[a.charAt(i)-97] + 1; 
				bArr[b.charAt(i)-97] = bArr[b.charAt(i)-97] + 1;
			}
			int aCount = 0, bCount = 0;
			//Finding the character frequency difference between two strings
			for(int i=0;i<aArr.length;i++) {
				if(aArr[i] > 0) {
					aCount += aArr[i];
					bCount += bArr[i];
				}
			}
			int diff = Math.abs(aCount - bCount);
			System.out.println("No of char need to modify to make two strings anagrams ::"+diff);
		}
	}
}
