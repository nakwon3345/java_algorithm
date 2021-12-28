package practice4;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static char solution(int t, String str) {
		char answer = ' ';
		HashMap<Character, Integer> map = new HashMap<>();
		for(char x : str.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		int max = 0;
		for(char key : map.keySet()) {
			if(map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
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
