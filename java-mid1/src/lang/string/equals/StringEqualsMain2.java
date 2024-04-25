package lang.string.equals;

/**
 * @author : yong
 * @fileName : StringEqualsmain1
 * @date : 2024-04-26
 * @description :
 */
public class StringEqualsMain2 {

    public static void main(String[] args) {
        String str1 = new String("hello");  //x001
        String str2 = new String("hello");  //x002
        System.out.println("메서드 호출 비교1: " + isSame(str1, str2));

        String str3 = "hello";  //x003
        String str4 = "hello";  //x004
        System.out.println("메서드 호출 비교2: " + isSame(str3, str4));
    }

    private static boolean isSame(String x, String y) {
        return x == y;
    }

}
