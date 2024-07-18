package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain2 {

	public static void main(String[] args) {
		Animal animal = new Animal("동물", 0);
		Dog dog = new Dog("멍멍이", 100);
		Cat cat = new Cat("냐옹이", 50);

		Box<Animal> animalBox = new Box<>();
		animalBox.setValue(animal);
		animalBox.setValue(dog);
		animalBox.setValue(cat);

		// 타입 매개변수가 Animal이기 때문에 비록 cat을 넣었지만, 막 꺼냈을 때는 Animal 타입이다.
		Animal findAnimal = animalBox.getValue();
		System.out.println("findAnimal = " + findAnimal);

		// 물론 자식 타입을 원한다면 다운 캐스팅하면 된다.
		Cat findCat = (Cat) animalBox.getValue();
	}

}
