package _2_1_큰수출력하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public ArrayList<Integer> solution(int t, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);
		for(int i = 1; i < t; i++) {
			if(arr[i]>arr[i-1]) {
				answer.add(arr[i]);
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		int[] arr = new int[t];
		for(int i = 0; i < t; i++) {
			arr[i] = kb.nextInt();
		}
		for(int x : T.solution(t, arr)) {
			System.out.println(x + " ");
		}
	}

}
