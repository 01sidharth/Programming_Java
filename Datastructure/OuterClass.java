package Datastructure;

public class OuterClass {
	OuterClass(){
		System.out.println("outer class");
	}
	static class InnerClass{
		public InnerClass(){
			System.out.println("Inner class");
		}
	}
	public static void main(String[] args) {
		OuterClass o1=new OuterClass();
		InnerClass i1=new InnerClass();//static 
//		InnerClass i1=o1.new InnerClass();//non static
		//innerclassname ref =outerclassref.new innerclassname
	}
}
//refer test.java