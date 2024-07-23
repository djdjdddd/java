package generic.ex5;

import generic.animal.Animal;

public class WildcardEx {

	// 제네릭 메서드 1
	static <T> void printGenericV1(Box<T> box){
		System.out.println("T = " + box.getValue());
	}

	// 와일드카드 1
	static void printWildcardV1(Box<?> box){
		System.out.println("? = " + box.getValue());
	}

	// 제네릭 메서드 2
	static <T extends Animal> void printGenericV2(Box<T> box){
		T t = box.getValue();
		System.out.println("이름 = " + t.getName());
	}

	// 와일드카드 2
	static void printWildcardV2(Box<? extends Animal> box){
		Animal animal = box.getValue();
		System.out.println("이름 = " + animal);
	}

	// 제네릭 메서드 3
	static <T extends Animal> T printAndReturnGeneric(Box<T> box){
		T t = box.getValue();
		System.out.println("이름 = " + t.getName());
		return t;
	}

	// 와일드카드 3
	static Animal printAndReturnWildcard(Box<? extends Animal> box){
		Animal animal = box.getValue();
		System.out.println("이름 = " + animal.getName());
		return animal;
	}
	
}
