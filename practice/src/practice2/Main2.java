package practice2;

import java.util.Scanner;

public class Main2 {
	
	public String solution(String c){
		String answer = "";
		for(int i = 0; i < c.length(); i++) {
			int num = c.charAt(i);
			//System.out.println(num);
			String tmp = Integer.toBinaryString(num);
			//System.out.println(tmp);
			answer += tmp.substring(0, 7).replace('1', '#').replace('0', '*');
			
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner kb = new Scanner(System.in);
		String c = kb.next();
		System.out.println(T.solution(c));
	}

}
