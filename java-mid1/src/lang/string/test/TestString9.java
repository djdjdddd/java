package lang.string.test;

import java.util.Arrays;

/**
 * @author : yong
 * @fileName : TestString1
 * @date : 2024-04-26
 * @description :
 */
public class TestString9 {

    public static void main(String[] args) {
        // split()를 사용해서 이메일의 ID 부분과 도메인 부분을 분리해라
        String email = "hello@example.com";

        String[] strArr = email.split("@");
        Arrays.stream(strArr).forEach(str -> System.out.println("str = " + str));
    }

}
