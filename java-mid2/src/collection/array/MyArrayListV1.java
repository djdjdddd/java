package collection.array;

import java.util.Arrays;

public class MyArrayListV1 {

	private static final int DEFAULT_CAPACITY = 5;

	private Object[] elementData;
	private int size = 0;

	public MyArrayListV1(){
		elementData = new Object[DEFAULT_CAPACITY];
	}

	public MyArrayListV1(int initialCapacity){
		elementData = new Object[initialCapacity];
	}

	public int size(){
		return size;
	}

	public void add(Object e){
		elementData[size] = e;
		size++;
	}

	public Object get(int index){
		return elementData[index];
	}

	// 교체된 값을 리턴하도록 구현
	public Object set(int index, Object element){
		Object oldValue = get(index);
		elementData[index] = element;
		return oldValue;
	}

	// 검색
	public int indexOf(Object o){
		for (int i = 0; i < size; i++) {
			if(o.equals(elementData[i])){
				return i;
			}
		}
		return -1;	// 못 찾으면 -1 리턴
	}

	public String toString(){
		Object[] copyArr = Arrays.copyOf(elementData, size);
		// [1, 2, 3, null, null]
		// [1, 2, 3] <- by copyOf()

		return Arrays.toString(copyArr);
	}

}
