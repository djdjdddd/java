package generic.animal;

public class Dog extends Animal{

	public Dog(String name, int size) {
		super(name, size);
	}

	// Override 단축기 : Ctrl + O
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
