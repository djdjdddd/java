package lang.string.builder;

/**
 * @author : yong
 * @fileName : StringBuilderMain1_1
 * @date : 2024-04-26
 * @description :
 */
public class StringBuilderMain1_2 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String string = sb.append("A").append("B").append("C").append("D")
                .insert(4, "Java")
                .delete(4, 8)
                .reverse()
                .toString();
        System.out.println("string = " + string);
    }

}
