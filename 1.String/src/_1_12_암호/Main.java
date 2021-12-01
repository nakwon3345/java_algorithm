package _1_12_암호;

import java.util.Scanner;

public class Main {
	
	public String solution(int n, String str){
		String answer = "";
		for(int i = 0; i < n; i++) {
			String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
			int num = Integer.parseInt(tmp, 2);
			answer += (char)num;
			str = str.substring(7);
		}

		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		System.out.println(T.solution(n, str));
	}

}
