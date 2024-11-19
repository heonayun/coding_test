package test;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

		// N 마리의 소
		// N 개의 배열
		// 배열에 소들의 키를 저장
		
		Scanner sc=new Scanner(System.in);
		
		// N을 받기
		System.out.print("소는 몇 마리인가요? >> ");
		int N=sc.nextInt();
		int[] datas=new int[N];
		
		System.out.println("숫자를 입력해주세요. >>  ");
		for(int i=0;i<datas.length;i++) {
			datas[i]=sc.nextInt();
		}
		
		int count=0;
		// index 0 --->> N 헤어를 확인
		for(int i=0;i<N;i++) {
			/*
			datas[0]이랑 datas[1]랑 비교하고,
			datas[0]이랑 datas[2]랑 비교하고,
			datas[0]이랑 datas[3]랑 비교하고,
			
			datas[1]이랑 datas[2]랑...
			*/
			
			// 1) 범위가 정해져있다.
			for(int j=i+1;j<N;j++){
				if(datas[i] <= datas[j]) {
					break;
				}
				count++;
			}
			
			// 2) 정확한 반복횟수를 모른다.
			/*
			int j=i+1;
			while(datas[i] > datas[j] && j<N) {
				count++;
				j++;
			}
			*/
		}
		
		// datas[0] > datas[1] 헤어 확인가능
		//   계속확인가능
		// datas[0] <= datas[1] 헤어 확인불가능
		//   더이상 확인할수없음
		
		// 확인 횟수를 출력		
		System.out.println(count);
		
	}

}
