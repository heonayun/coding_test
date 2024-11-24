package test3;

import java.util.Scanner;

/*
 정수 배열 numbers가 매개변수로 주어집니다. 
 numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
*/
public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 배열의 크기를 정하기 위해서 정수를 입력받는다.
		System.out.print("배열 크기 >> ");
		int N = sc.nextInt();
		int[] datas = new int[N];

		// 점수를 입력받아 배열에 저장한다.
		System.out.print("점수 >> ");
		for (int i = 0; i < datas.length; i++) {
			int number = sc.nextInt();
			datas[i] = number;
		}

		// 합을 담을 변수를 선언하고 배열을 반복하여 누적합한다.
		int sum = 0;
		for (int i = 0; i < datas.length; i++) {
			sum += datas[i];
		}
		System.out.println("sum : " + sum);

		// 누적합한 값을 배열의 길이만큼 나눈다.
		double avg = sum * 1.0 / datas.length;
		System.out.println("avg : " + avg);

		for (int i = 0; i < datas.length; i++) {
			System.out.print(datas[i] + " ");
		}
	}

}
