package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1912_김상현 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[N+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max = -1000;
		for(int i=1;i<=N;i++) {
			int num = Integer.parseInt(st.nextToken());
			dp[i] = Math.max(dp[i-1]+ num,num);
			if(dp[i]>max) {
				max = dp[i];
			}
		}
		System.out.println(max);
	}

}
