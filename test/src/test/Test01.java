package test;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {

		// N 크기만큼의 배열
		// N 만큼의 정수 받기
		// 제일 작은 수와 제일 큰 수의 차이
		
		Scanner sc=new Scanner(System.in);
		
		// N을 받기
		System.out.print("학생 몇 명인가요? >> ");
		int N=sc.nextInt();
		int[] datas=new int[N];
		
		// N개의 정수 받기
		System.out.print("점수를 입력해주세요. >> ");
		
		for(int i=0;i<datas.length;i++) {
			datas[i]=sc.nextInt();
		}
		
		int max = datas[0]; // 최대값
		int min = datas[0]; // 최소값
		
		for(int i =0; i<datas.length; i++) {
			if(max<datas[i]) {
				max = datas[i];
			}
			
			if(min>datas[i]) {
				min = datas[i];
			}
		}
		
		int result = max-min;
		System.out.println("최대값 :" + max);
		System.out.println("최소값 :" + min);
		System.out.println("결과 :" + result);
	}
}
