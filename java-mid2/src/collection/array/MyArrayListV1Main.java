package collection.array;

public class MyArrayListV1Main {

	public static void main(String[] args) {
		MyArrayListV1 list = new MyArrayListV1();

		System.out.println("데이터 추가");
		System.out.println(list);
		list.add("a");

		System.out.println(list);
		list.add("b");

		System.out.println(list);
		list.add("c");

		System.out.println("기능 사용");
		System.out.println("list.size() = " + list.size());
		System.out.println("list.get(1) = " + list.get(1));
		System.out.println("list.indexOf(\"b\") = " + list.indexOf("b"));
		System.out.println("list.set(2, \"z\") = " + list.set(2, "z"));
	}

}
