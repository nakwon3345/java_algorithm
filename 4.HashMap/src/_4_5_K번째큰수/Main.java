package _4_5_K번째큰수;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static int solution(int t, int p, int[] arr){
		int answer = -1;
		TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
		for(int i = 0; i < t; i ++) {
			for(int j = i + 1; j < t; j++) {
				for(int l = j + 1; l < t; l++) {
					set.add(arr[i] + arr[j] + arr[l]);
				}
			}
		}
		int cnt = 0;
		for(int x : set) {
			cnt++;
			if(cnt == p) {
				answer = x;
			}
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
		System.out.println(solution(t, p, arr));
	}
}
