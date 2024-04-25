package lang.string.builder;

/**
 * @author : yong
 * @fileName : StringBuilderMain1_1
 * @date : 2024-04-26
 * @description :
 */
public class StringBuilderMain1_1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        // append() : 마지막 부분에 문자열을 추가
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        // insert() : 특정 위치에 문자열을 삽입
        sb.insert(4, "Java");
        System.out.println("insert = " + sb);

        // delete() : 특정 범위의 문자열을 삭제
        sb.delete(4, 8);
        System.out.println("delete = " + sb);

        // reverse() : 문자열 뒤집기
        sb.reverse();
        System.out.println("reverse = " + sb);

        // toString() : StringBuilder -> String
        String string = sb.toString();
        System.out.println("string = " + string);
    }

}
