/**
 * @author khasim
 *
 * Finding the Parenthesis pairs are present for  (,{,[
 */


public class MatchingParenthesis {
	public static void main(String[] args) {
		String str = "({()}{}{()})";
		if(str.length()%2 != 0) {
			System.out.println("NO");
			return;
		}
		char charArr[] = new char[str.length()];
		int k=0;
		for(int i=0;i<str.length();i++) {
			if(k == 0 && (str.charAt(i) == ')' || str.charAt(i) == '}' || str.charAt(i) == ']')) {
				System.out.println("NO");
				return;
			}
			if(str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[') {
				charArr[k] = str.charAt(i);
				k++;
			}else if(str.charAt(i) == '}') {
				if(charArr[k-1] != '{') {
					System.out.println("NO");
					return;
				}else {
					k--;
				}
			}else if(str.charAt(i) == ')') {
				if(charArr[k-1] != '(') {
					System.out.println("NO");
					return;
				}else {
					k--;
				}
			}else if(str.charAt(i) == '}') {
				if(charArr[k-1] != '{') {
					System.out.println("NO");
					return;
				}else {
					k--;
				}
			}
		}
		if(k==0) {
			System.out.println("YES");
		}
	}
}
