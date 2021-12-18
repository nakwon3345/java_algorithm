package _4_1_학급회장;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static char solution(int t, String str){
		char answer = ' ';
		HashMap<Character, Integer> map = new HashMap<>();
		for(char x : str.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		return answer;
		
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		String str = kb.next();
		System.out.println(solution(t, str));
	}
}
