package day06;

public class Parent {
	public String nation;
	
	public Parent() {
		this("���ѹα�");
		System.out.println("Parent() call");
	}
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
	
	
	
	/*
	public String name;
	
	public Parent(String name) {
		this.name = name;
	}
	*/
}
