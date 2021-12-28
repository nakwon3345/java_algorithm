package practice4;

import java.util.HashMap;
import java.util.Scanner;

public class Main_4_2 {
	public static String solution(String str, String str2) {
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<>();
		for(char x : str.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		for(char x : str2.toCharArray()) {
			if(!map.containsKey(x) || map.get(x) == 0) {
				return "NO";
			}
			map.put(x, map.get(x) - 1);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		String str2 = kb.next();
		System.out.println(solution(str, str2));
	}

}
