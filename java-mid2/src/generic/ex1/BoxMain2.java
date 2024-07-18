package generic.ex1;

public class BoxMain2 {

	public static void main(String[] args) {
		ObjectBox integerBox = new ObjectBox();
		integerBox.setValue(10);
		Object value = integerBox.getValue();

		// 문제 1. 값을 꺼낼 때마다 다운 캐스팅을 해야 하는 번거로움
		Integer integer = (Integer) value;
		System.out.println("integer = " + integer);

		// 문제 2. 잘못된 타입의 인수 전달 문제
		// - 이 경우 값을 꺼낼 때 문제가 발생한다. (ClassCastException)
		integerBox.setValue("문자100");
		Integer value1 = (Integer) integerBox.getValue();	// ClassCastException 발생
		System.out.println("value1 = " + value1);
	}

}
