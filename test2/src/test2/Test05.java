package test2;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// N 개의 탑
		// N 개의 탑의 높이
		// 왼쪽의 탑 중에 제일 먼저 만나는 탑의 INDEX에 값을 넣어서 배열 출력

		Scanner sc = new Scanner(System.in);

		System.out.print("턉은 몇 개인가요? >> ");
		int N = sc.nextInt();
		int[] datas = new int[N];

		System.out.print("탑의 높이를 입력해주세요. >> ");
		for (int i = 0; i < datas.length; i++) {
			datas[i] = sc.nextInt();
		}
		System.out.println("datas.length : " + datas.length);

		// datas[i] < datas[i-1]이면, datas[i]=i
		for (int i = datas.length; i <= 0 ; i--) {
			System.out.println("i : " + i);
			if (datas[i] <= datas[i-1]) {
				System.out.println("i : " + i);
				datas[i] = i;
			} else {
				datas[i] = 0;
			}
		}

		for (int v : datas) {
			System.out.print(v + " ");
		}
	}

}
