package lang.string.immutable;

/**
 * @author : yong
 * @fileName : StringImmutable1
 * @date : 2024-04-26
 * @description :
 */
public class StringImmutable2 {

    public static void main(String[] args) {
        String str = "hello";
        String str2 = str.concat(" java");  // concat 메서드를 살펴보면 리턴값이 있다.
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);
    }

}
