package lang.string.test;

/**
 * @author : yong
 * @fileName : TestString1
 * @date : 2024-04-26
 * @description :
 */
public class TestString1 {

    public static void main(String[] args) {
        // startsWith() 를 사용해서 url 이 https:// 로 시작하는지 확인해라
        String url = "https://www.example.com";

        boolean b = url.startsWith("https://");
        System.out.println("b = " + b);
    }

}
