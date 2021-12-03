package _2_4_피보나치수열;

import java.util.Scanner;

public class Main2 {
	
	public static void solution(int t){
		int a = 1;
		int b = 1;
		System.out.print(a + " " + b + " ");
		for(int i = 2; i < t; i++) {
			int c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		solution(t);
		
	}
}
