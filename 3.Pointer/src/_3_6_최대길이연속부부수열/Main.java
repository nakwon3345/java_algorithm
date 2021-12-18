package _3_6_최대길이연속부부수열;

import java.util.Scanner;

public class Main {
	public static int solution(int t, int p, int[] arr){
		int answer = 0;
		int cnt = 0;
		int lt = 0;
		for(int rt = 0; rt < t; rt++){
			if(arr[rt] == 0) {
				cnt++;
			}
			while(cnt > p){
				if(arr[lt] == 0) {
					cnt--;
				}
				lt++;
			}
			answer=Math.max(answer, rt - lt + 1);
		}
		return answer;
	}

	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		int p = kb.nextInt();
		int[] arr=new int[t];
		for(int i = 0; i < t; i++){
			arr[i] = kb.nextInt();
		}
		System.out.print(solution(t, p, arr));
	}
}
