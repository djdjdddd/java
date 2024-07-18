package generic.ex1;

public class BoxMain3 {

	public static void main(String[] args) {
		GenericBox<Integer> integerBox = new GenericBox<>();	// 생성 시점에 T의 타입 결정
		integerBox.setValue(100);
//		integerBox.setValue("100");	// 컴파일 오류로 미리 걸러준다.
		Integer value = integerBox.getValue();	// 다운 캐스팅이 필요 없다.

		// 원하는 모든 타입 사용 가능
		GenericBox<Double> doubleBox = new GenericBox<>();
	}

}
