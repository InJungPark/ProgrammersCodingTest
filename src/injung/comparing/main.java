package injung.comparing;

public class main {

    /**
     * 숫자 비교하기
     * https://school.programmers.co.kr/learn/courses/30/lessons/120807
     * 정수 num1과 num2가 매개변수로 주어집니다.
     * 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.
     **/

    public int comparing(int num1, int num2) {

        // return mun 1 == num2? 1: -1; // 이것도 됨

        int comparing = 0;

        if (num1 == num2) {
            return 1;
        } else {
            return -1;
        }

    }

    public static void main(String[] args) {

        main mn = new main();

        int result = mn.comparing(11, 11);

        System.out.println(result);

    }

}
