package lang.string.test;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author : yong
 * @fileName : TestString1
 * @date : 2024-04-26
 * @description :
 */
public class TestString10 {

    public static void main(String[] args) {
        // split()를 사용해서 fruits를 분리하고, join()을 사용해서 분리한 문자들을 하나로 합쳐라
        String fruits = "apple,banana,mango";

        String[] strArr = fruits.split(",");
        String string = Arrays.stream(strArr).collect(Collectors.joining("->"));
        System.out.println("string = " + string);
    }

}
