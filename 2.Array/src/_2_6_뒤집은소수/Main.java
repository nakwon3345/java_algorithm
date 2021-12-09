package _2_6_뒤집은소수;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {
	public static boolean isPrime(int num) {
		if(num == 1) {
			return false;
		}
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static ArrayList<Integer> solution(int t, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		for(int i = 0; i < t; i++) {
			int tmp = arr[i];
			int res = 0;
			while(tmp > 0) {
				int reverse = tmp % 10;
				res = res * 10 + reverse;
				tmp = tmp/10;
			}
			if(isPrime(res)) {
				answer.add(res);
			}
			
		}
		return answer;
	}
	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		for(int x : solution(n, arr)){
			System.out.print(x + " ");
		}
	}
}
