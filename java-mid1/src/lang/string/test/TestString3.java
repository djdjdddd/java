package lang.string.test;

/**
 * @author : yong
 * @fileName : TestString1
 * @date : 2024-04-26
 * @description :
 */
public class TestString3 {

    public static void main(String[] args) {
        // str에서 ".txt" 문자열이 언제부터 시작하는지 위치를 찾아서 출력해라
        String str = "hello.txt";

        int index = str.indexOf(".txt");
        System.out.println("index = " + index);
    }

}
