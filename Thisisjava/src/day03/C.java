package day03;
import day04.*;
public class C {
	public C() {
		A a = new A();
		a.field1 = 1;
		//a.field2 = 1;  //default 필드 접근불가
		//a.field3 = 1;  //private 필드 접근불가
		
		a.method1();
		//a.method2();  //default 메소드 접근불가
		//a.method3();  //private 메소드 접근불가
	}

}
