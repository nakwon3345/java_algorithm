package _2_2_보이는학생;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public int solution(int t, int[] arr){
		int answer = 1;
		int max = arr[0];
		for(int i = 1; i < t; i++) {
			if(arr[i] > max) {
				max = arr[i];
				answer++;
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
		
		System.out.println(T.solution(t, arr));
		
	}

}
