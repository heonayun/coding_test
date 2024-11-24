package test3;

import java.util.Scanner;
import java.util.Stack;

/*
머쓱이는 친구들과 369게임을 하고 있습니다. 
369게임은 1부터 숫자를 하나씩 대며 3, 6, 9가 들어가는 숫자는 숫자 대신 3, 6, 9의 개수만큼 박수를 치는 게임입니다. 
머쓱이가 말해야하는 숫자 order가 매개변수로 주어질 때, 머쓱이가 쳐야할 박수 횟수를 return 하도록 solution 함수를 완성해보세요.
*/

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 정수를 입력받는다.
		System.out.print("정수 >> ");
		int number = sc.nextInt();
		System.out.println("order : " + number);

		// 정수를 문자열로 변경한다.
		String numberStr = Integer.toString(number);
		System.out.println("numberStr : " + numberStr);
		System.out.println("numberStr.length() : " + numberStr.length());

		// 배열을 문자열의 길이만큼 생성한다.
		int[] digits = new int[numberStr.length()];

		// 배열 안에 정수를 하나씩 저장한다.
		for (int i = 0; i < numberStr.length(); i++) {
			digits[i] = numberStr.charAt(i) - '0';
		}

		// 배열을 반복하여 3,6,9가 있는지 확인한다.
		// 있으면 +1하고
		// 없으면 다음 배열을 검사
		int result = 0;
		for (int i = 0; i < numberStr.length(); i++) {
			if (digits[i] == 3 || digits[i] == 6 || digits[i] == 9) {
				result++;
			} 
			else {
				continue;
			}
		}
		
		System.out.println("result : "+result);
		
		// 배열을 출려하면 입력한 정수가 하나씩 보여진다.
		for (int i = 0; i < digits.length; i++) {
			System.out.print(digits[i] + " ");
		}

	}
}
