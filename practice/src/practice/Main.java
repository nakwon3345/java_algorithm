package practice;

import java.util.Scanner;

public class Main {
	
	public String solution(int t, String str){
		String answer = "";
		for(int i = 0; i < t; i++) {
			String security = str.substring(0, 7).replace('#', '1').replace('*', '0');
			//System.out.println(security);
			int num = Integer.parseInt(security, 2);
			//System.out.println(num);
			answer += (char)num;
			str = str.substring(7);
		}

		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		String str = kb.next();
		System.out.println(T.solution(t, str));
	}

}
