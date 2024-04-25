package lang.string.chaining;

/**
 * @author : yong
 * @fileName : MethodChainingMain1
 * @date : 2024-04-26
 * @description :
 */
public class MethodChainingMain3 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();

        int result = adder.add(1).add(2).add(3).getValue();
        System.out.println("result = " + result);
    }

}
