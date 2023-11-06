package String;
import java.util.Scanner;

class Quiz03_Split{
	
	public String solution(String str) {
		
		String answer = "";
		int m = Integer.MIN_VALUE;
		String[] strArr = str.split(" ");
		
		for(String x : strArr) {
			int len = x.length();
		
			//최소값 구해주는 알고리즘
			if (len > m) {
				m = len;
				answer = x;
			}
		}
		return answer;
	};
	
	public static void main(String[] args) {
		
		Quiz03_Split T = new Quiz03_Split();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}
	
}
