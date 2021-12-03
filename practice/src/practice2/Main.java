package practice2;

import java.util.Scanner;

public class Main {
	
	public String solution(char c){
		String answer = "";
		int num = (int)c;
		System.out.println(num);
		String tmp = Integer.toBinaryString(num);
		System.out.println(tmp);
		answer = tmp.substring(0, 7).replace('1', '#').replace('0', '*');
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		char c = kb.nextLine().charAt(0);
		System.out.println(T.solution(c));
	}

}
