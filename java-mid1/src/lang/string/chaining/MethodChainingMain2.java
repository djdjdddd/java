package lang.string.chaining;

/**
 * @author : yong
 * @fileName : MethodChainingMain1
 * @date : 2024-04-26
 * @description :
 */
public class MethodChainingMain2 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 = adder.add(1);
        ValueAdder adder2 = adder1.add(2);
        ValueAdder adder3 = adder2.add(3);

        int result = adder3.getValue();
        System.out.println("result = " + result);

        // ValueAdder 클래스의 add 메서드는 this(자기 자신)를 리턴하고 있으므로 로그를 찍게 되면 모두 동일한 주소 값을 얻을 수 있다.
        System.out.println(adder);  //lang.string.chaining.ValueAdder@4dd8dc3
        System.out.println(adder1); //lang.string.chaining.ValueAdder@4dd8dc3
        System.out.println(adder2); //lang.string.chaining.ValueAdder@4dd8dc3
        System.out.println(adder3); //lang.string.chaining.ValueAdder@4dd8dc3
    }

}
