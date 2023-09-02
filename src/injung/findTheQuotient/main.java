package injung.findTheQuotient;

public class main {
    public static void main(String[] args) {

        /**
         * https://school.programmers.co.kr/learn/courses/30/lessons/120805
         * 정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.
         * */

        int num1 = 10;
        int num2 = 5;
        int result = num1 / num2;
        System.out.println(result);

        System.out.println("----------------");

        System.out.println(getResult(10, 5));
        System.out.println(getResult(7, 2));
        System.out.println(getResult(15, 5));

    }

    public static int getResult(int num1, int num2) {
        int result = num1 / num2;
        return result;

    }

}
