package injung.age;

public class main {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120820
     * 머쓱이는 40살인 선생님이 몇 년도에 태어났는지 궁금해졌습니다. 나이 age가 주어질 때, 2022년을 기준 출생 연도를 return 하는 solution 함수를 완성해주세요.
     **/

    public static int birth(int age) {

        int year = 2023 - age + 1;
        return year;

    }

    public static void main(String[] args) {

        int age = 23;
        int year = birth(age);
        System.out.println(year);

    }

}
