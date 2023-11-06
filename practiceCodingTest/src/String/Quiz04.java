package String;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz04 {
	
	//단어 뒤집기
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		
		
		/*
		 * 전체 뒤집기
		 * for(String x : str) {		
		 *	 String tmp = new StringBuilder(x).reverse().toString();
		 *	 answer.add(tmp);
		}*/
		
		for(String x : str) {
			char[] s = x.toCharArray();
			
		}
		
		return answer;
	};
	
	public static void main(String[] args) {
		
		Quiz04 T = new Quiz04();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = kb.next();
		}
		for (String x : T.solution(n,str)) {
			System.out.println(x);
		}
		
	}
}
