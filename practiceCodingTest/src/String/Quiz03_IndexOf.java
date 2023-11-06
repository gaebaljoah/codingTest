package String;
import java.util.Scanner;

class Quiz03_IndexOf{
	
	public String solution(String str) {
		
		String answer = "";
		int m = Integer.MIN_VALUE;
		int pos;
		//띄어쓰기의 위치를 return해줌
		//System.out.println(str.indexOf(' '));
		
		//띄어쓰기가 없는 문장을 발견시 -1 리턴 있는 문장이면 띄어쓰기의 index값을 pos에 넣어줌
		while( (pos = str.indexOf(' ') ) != -1) {
			String tmp = str.substring(0,pos);
			int len = tmp.length();
			
			if (len > m) {
				m=len;
				answer = tmp;
			}
			
			str = str.substring(pos+1);
		
			System.out.println("str...?"+str);
		}
		
		
		if (str.length() > m) {
			answer = str;
		}
	
		return answer;
	};
	
	public static void main(String[] args) {
		
		Quiz03_IndexOf T = new Quiz03_IndexOf();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}
	
}
