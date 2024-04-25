package lang.string.test;

/**
 * @author : yong
 * @fileName : TestString1
 * @date : 2024-04-26
 * @description :
 */
public class TestString4 {

    public static void main(String[] args) {
        // substring()을 사용해서 hello 부분과 .txt 부분을 분리해라
        String str = "hello.txt";

        int index = str.indexOf(".txt");
        String str1 = str.substring(0, index);
        String str2 = str.substring(index, str.length());

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }

}
