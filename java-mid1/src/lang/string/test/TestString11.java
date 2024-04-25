package lang.string.test;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author : yong
 * @fileName : TestString1
 * @date : 2024-04-26
 * @description :
 */
public class TestString11 {

    public static void main(String[] args) {
        // str 문자열을 반대로 뒤집어라. StringBuilder에 있는 reverse()를 사용
        String str = "Hello Java";

        StringBuilder sb = new StringBuilder(str);
        String reversedStr = sb.reverse().toString();
        System.out.println("reversedStr = " + reversedStr);
    }

}
