package nested.nested;

public class NestedOuterMain {

	public static void main(String[] args) {
		NestedOuter outer = new NestedOuter();
		NestedOuter.Nested nested = new NestedOuter.Nested();
		nested.print();

		// class nested.nested.NestedOuter$Nested
		// $ : 자바에서는 outer와 inner를 $ 기호로 구분한다.
		System.out.println("nested.getClass() = " + nested.getClass());
	}
	
}
