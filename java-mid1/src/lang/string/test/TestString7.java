package lang.string.test;

/**
 * @author : yong
 * @fileName : TestString1
 * @date : 2024-04-26
 * @description :
 */
public class TestString7 {

    public static void main(String[] args) {
        // 문자의 양쪽 공백을 제거하라
        String original = "    Hello Java   ";

        String trim = original.trim();
        System.out.println("trim = " + trim);
    }

}
