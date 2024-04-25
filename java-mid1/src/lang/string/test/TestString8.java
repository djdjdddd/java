package lang.string.test;

/**
 * @author : yong
 * @fileName : TestString1
 * @date : 2024-04-26
 * @description :
 */
public class TestString8 {

    public static void main(String[] args) {
        // replace()를 사용해서 java라는 단어를 jvm으로 변경해라
        String input = "hello java spring jpa java";

        String replace = input.replace("java", "jvm");
        System.out.println("replace = " + replace);
    }

}
