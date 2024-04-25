package lang.string.builder;

/**
 * @author : yong
 * @fileName : LoopStringMain
 * @date : 2024-04-26
 * @description :
 */
public class LoopStringMain {

    // 다음과 같이 문자열을 루프 안에서 문자열을 더하는 경우에는 최적화가 이뤄지지 않는다.
    // 고작 10만 번의 반복문을 도는데 거의 ~8.7초가 소요됐다.

    /**
     * String result = "";
     * for (int i = 0; i < 100000; i++) {
     *     result = new StringBuilder().append(result).append("Hello Java
     * ").toString();
     * }
     */
    // 대략 위와 같은 방식으로 최적화가 일어나게 되며, 반복 횟수인 10만개의 StringBuilder, String 객체를 생성했을 것이다.
    // 그로 인해 무지막지한 시간이 소요된 것이다.

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < 100000; i++) {
            result += "Hello Java ";
        }
        long endTime = System.currentTimeMillis();

        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime) + "ms");
        // 맥북 M2 기준 : 2570ms
        // 그램 i7 기준 : 8719ms
    }

}
