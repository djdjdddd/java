package nested.inner;

public class InnerOuterMain {

	public static void main(String[] args) {
		InnerOuter outer = new InnerOuter();
		InnerOuter.Inner inner = outer.new Inner();		// 문법에 유의하자. 외부 클래스 인스턴스인 outer를 이용하여 new 인스턴스(); 를 하고 있다.
		inner.print();

		// class nested.inner.InnerOuter$Inner
		System.out.println("inner.getClass() = " + inner.getClass());
	}

}
