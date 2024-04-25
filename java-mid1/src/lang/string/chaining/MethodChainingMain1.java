package lang.string.chaining;

/**
 * @author : yong
 * @fileName : MethodChainingMain1
 * @date : 2024-04-26
 * @description :
 */
public class MethodChainingMain1 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        adder.add(1);
        adder.add(2);
        adder.add(3);

        int result = adder.getValue();
        System.out.println("result = " + result);
    }

}
