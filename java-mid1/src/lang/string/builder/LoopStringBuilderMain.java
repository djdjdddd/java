package lang.string.builder;

/**
 * @author : yong
 * @fileName : LoopStringMain
 * @date : 2024-04-26
 * @description :
 */
public class LoopStringBuilderMain {

    // 따라서 이런 경우엔 StringBuilder 를 사용하면 제대로 된 최적화가 가능하다.
    // 겨우 7ms 밖에 걸리지 않은 것을 확인할 수 있었다.

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("Hello Java ");
        }
        long endTime = System.currentTimeMillis();

        String result = sb.toString();
        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime) + "ms");
        // 맥북 M2 기준 : 3ms
        // 그램 i7 기준 : 7ms
    }

    // StringBuilder 를 직접 사용하는 것이 더 좋은 경우
    // 1. 반복문에서 반복해서 문자를 연결할 때 (단, 반복횟수가 많을 때)
    // 2. 조건문을 통해 동적으로 문자열을 조합할 때
    // 3. 복잡한 문자열의 특정 부분을 변경해야 할 때
    // 4. 매우 긴 대용량 문자열을 다룰 때

}
