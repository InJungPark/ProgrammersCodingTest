package injung.remainder;

public class main {
    public static void main(String[] args) {

        /**
         * 나머지 구하기
         * https://school.programmers.co.kr/learn/courses/30/lessons/120810
         * 정수 num1, num2가 매개변수로 주어질 때,
         * num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.
         *
         * 힌트 → %는 나머지를 구하는거다!!!
         **/

        int num1 = 3;
        int num2 = 2;
        int num3 = 10;
        int num4 = 5;

        int remainder = num1 % num2;
        int remainder2 = num3 % num4;

        System.out.println(remainder);
        System.out.println(remainder2);

    }
}
