package lang.string.test;

/**
 * @author : yong
 * @fileName : TestString1
 * @date : 2024-04-26
 * @description :
 */
public class TestString2 {

    public static void main(String[] args) {
        // length()를 사용해서 arr 배열에 들어있는 모든 문자열의 길이 합을 구해라
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};

        int sumOfLength = 0;
        for(String str : arr){
            sumOfLength += str.length();
        }
        System.out.println("sumOfLength = " + sumOfLength);
    }

}
