package test2;

import java.util.Stack;

public class Test01 {
   public static int test(String input) {
      int result=0;
      Stack<Character> stack = new Stack<Character>();
      
      for(int i=0;i<input.length();i++) {
         char c=input.charAt(i);
         
         if(c == '(') {
            // 레이저인지, 막대긴인지 현재는 파악 불가능
            // 일단 스택에 저장
            stack.push(c);
         }
         else {
            stack.pop(); // 레이저 짝꿍 ( 를 먼저 제거
            if(input.charAt(i-1) == '(') {
               // () 레이저
               // 현재 스택에 저장된 막대기 수 만큼 조각이 나옴
               result += stack.size();
            }
            else {
               // )) 막대기
               // 조각 1개만 추가하면됨
               result++;
            }
         }
      }
      
      return result;
   }

   public static void main(String[] args) {
      
      String input="()(((()())(())()))(())";
      int result=test(input);
      System.out.println(result);
      
   }

}
