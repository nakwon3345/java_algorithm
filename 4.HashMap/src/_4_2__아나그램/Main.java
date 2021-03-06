package _4_2__์๋๊ทธ๋จ;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static String solution(String str1, String str2){
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<>();
		for(char x : str1.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		for(char x : str2.toCharArray()) {
			//map.put(x, map.getOrDefault(x, 0) + 1);
			if(!map.containsKey(x) || map.get(x) == 0) {
				return "NO";
			}
			map.put(x, map.get(x) - 1);
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str1 = kb.next();
		String str2 = kb.next();
		System.out.println(solution(str1, str2));
	}
}
