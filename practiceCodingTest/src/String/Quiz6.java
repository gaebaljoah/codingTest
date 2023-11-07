package String;
import java.util.Scanner;

public class Quiz6 {
	//특정문자 뒤집기
	
	public String solution(String str) {
		String answer = "";
		for (int i = 0; i < str.length(); i++) {
			//System.out.println(str.charAt(i) +" "+ i +" "+ str.indexOf(str.charAt(i)));
			if (str.indexOf(str.charAt(i)) == i) {
				//indexOf 사용시에는 중복된 문자가 나올 경우 그 문자가 처음 나온 인덱스 번호를 반환해준다.
				//i는 중복 여부 상관없이 순차적으로 인덱스번호를 번환해준다.
				//if 조건문처럼 indexOf로 가져온 인덱스 번호와 i가 일치하는 경우는 중북되지않은 것이므로 그 문자만 가져오면된다.
				answer += str.charAt(i);
				
			}
		}
		return answer;
	};
	
	public static void main(String[] args) {
		
		Quiz6 T = new Quiz6();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
		
	}
}
