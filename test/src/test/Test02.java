package test;

import java.util.Scanner;
import java.util.Stack;

public class Test02 {
	public static void main(String[] args) {

		// N 크기 만큼의 스택 공간 형성
		// N 만큼의 정수 받기
		// 0 아니면 그냥 스택에 저장
		// 0 이면 데이터 제거
		
		Scanner sc=new Scanner(System.in);
		
		// N을 받기
		System.out.print("정수는 몇 개인가요? >> ");
		int N=sc.nextInt();
		Stack<Integer> stack=new Stack<Integer>();
		
		System.out.println("숫자를 입력해주세요. >>  ");
		for(int i=0; i<N; i++) {
			int data=sc.nextInt();
			if(data != 0) {
				stack.push(data);
			}
			else {
				stack.pop();
			}
		}
		
		// 마지막에 스택에 남아있는 모든 데이터 총합
		int total=0;
		for(int v:stack) {
			total+=v;
		}
		
		System.out.println("total : "+total);
	}
}
