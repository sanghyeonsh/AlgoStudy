package YoutubeStrudy;

import java.util.Scanner;

public class DP1_LISTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //수열의 크기
		int[] arr = new int[N];  //수열의 원소들 저장
		int[] LIS = new int[N];  //자신을 끝으로 하는 LIS길이
		
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		int max = 0;
		for(int i=0;i<N;i++) { //모든 원소에 대해 자신을 끝으로 하는 LIS길이 계산
			LIS[i] = 1; //자신 혼자 LIS구성할 때의 길이 1로 초기화
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i] && LIS[i]<LIS[j]+1) { //arr[j]<arr[i]: 증가수열의 모습
					LIS[i] = LIS[j]+1;
				}
			}
			if(max<LIS[i]) max = LIS[i];
		}
		System.out.println(max);
	}

}
