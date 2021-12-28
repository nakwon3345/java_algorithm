package _4_4_모든아나그램찾기;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static int solution(String str1, String str2){
		int answer = 0;
		HashMap<Character, Integer> am = new HashMap<>();
		HashMap<Character, Integer> bm = new HashMap<>();
		for(char x : str2.toCharArray()) {
			bm.put(x, bm.getOrDefault(x, 0) + 1);
		}
		for(int i = 0; i < str2.length() -1; i++) {
			am.put(str1.charAt(i), am.getOrDefault(str1.charAt(i), 0) + 1);
		}
		int lt = 0;
		for(int i = str2.length() - 1; i < str1.length(); i++){
			am.put(str1.charAt(i), am.getOrDefault(str1.charAt(i), 0) + 1);
			if(am.equals(bm)) {
				answer++;
			}
			am.put(str1.charAt(lt), am.get(str1.charAt(lt)) - 1);
			if(am.get(str1.charAt(lt)) == 0) {
				am.remove(str1.charAt(lt));
			}
			lt++;
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
