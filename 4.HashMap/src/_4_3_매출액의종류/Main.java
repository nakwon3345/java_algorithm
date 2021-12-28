package _4_3_매출액의종류;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static ArrayList<Integer> solution(int t, int p, int[]arr){
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < p - 1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		int lt = 0;
		for(int i = p - 1; i < t; i++ ) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
			answer.add(map.size());
			map.put(arr[lt], map.get(arr[lt]) - 1);
			if(map.get(arr[lt]) == 0) {
				map.remove(arr[lt]);
			}lt++;
		}
		return answer;
		
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		int p = kb.nextInt();
		int[] arr = new int[t];
		for(int i = 0; i < t; i++) {
			arr[i] = kb.nextInt();
		}
		for(int x : solution(t, p, arr)) {
			System.out.print(x + " ");
		}
	}
}
