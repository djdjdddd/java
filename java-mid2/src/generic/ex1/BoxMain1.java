package generic.ex1;

public class BoxMain1 {

	public static void main(String[] args) {
		IntegerBox integerBox = new IntegerBox();
		integerBox.setValue(10);	//오토 박싱
		Integer value = integerBox.getValue();
		System.out.println("value = " + value);

		StringBox stringBox = new StringBox();
		stringBox.setValue("hello");
		String value1 = stringBox.getValue();
		System.out.println("value1 = " + value1);
	}

}
