package generic.ex4;

public class MethodMain1 {

	public static void main(String[] args) {
		Integer i = 10;

		// 1. 제네릭 미사용
		Object o = GenericMethod.objMethod(10);
		Integer result = (Integer) o;

		// 2. 제네릭 메서드 사용, but 제한 X
		// 타입 인자(Type Argument) 명시적 전달
		Integer i1 = GenericMethod.<Integer>genericMethod(10);	// <Integer> 를 통해 타입 매개변수 T를 Integer로 지정할 수 있다.

		// 3. 제네릭 메서드 사용, 제한 O
		Integer i2 = GenericMethod.numberMethod(10);
	}
}
