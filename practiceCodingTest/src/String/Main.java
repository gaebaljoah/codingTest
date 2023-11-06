package String;
import java.util.Scanner;

class Main{
	
	public String solution(String str) {
		
		String answer = "";
		
		for(char x : str.toCharArray()) {
			answer += Character.isUpperCase(x) ? Character.toLowerCase(x): Character.isLowerCase(x)? Character.toUpperCase(x) : x;
		}
		
		
		return answer;
	};
	
	public static void main(String[] args) {
		
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		System.out.println(T.solution(str));
		
	}
}
