package lesson13.Generic;

public class BoxExam {

	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		box1.set("hello");
		String str = box1.get();
		System.out.println(str);
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(100);
		int value = box2.get();
		System.out.println(value);

	}

}
