package lang.string.method;

/**
 * @author : yong
 * @fileName : StringComparisonMain
 * @date : 2024-04-26
 * @description :
 */
public class StringComparisonMain {

    public static void main(String[] args) {
        String str1 = "Hello, Java!";   //대문자 일부 있음
        String str2 = "hello, java!";   //대문자 없음. 모두 소문자
        String str3 = "Hello, World!";

        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2));

        System.out.println("'a' compareTo 'b': " + "a".compareTo("b")); // a가 b에 대해 -1 (1만큼 '앞'에 있다)
        System.out.println("'b' compareTo 'a': " + "b".compareTo("a")); // b는 a에 대해 1 (1만큼 '뒤'에 있다)
        System.out.println("'c' compareTo 'a': " + "c".compareTo("a"));

        System.out.println("str1 compareTo str3: " + str1.compareTo(str3));
        System.out.println("str1 compareToIgnoreCase str2: " + str1.compareToIgnoreCase(str2));

        System.out.println("str1 starts with 'Hello'" + str1.startsWith("Hello"));
        System.out.println("str1 ends with 'Hello'" + str1.endsWith("Java!"));
    }

}
