package com.softserve.edu06.catingObject;

public class ApplAB {
	public static void main(String[] args) {

		System.out.println("The Start.");

		ClassA a = new ClassA();
		System.out.println("Test ClassA.");
		a.m1();
		a.m2();
		a.m3();
		a.m4();
		System.out.println();

		ClassB b = new ClassB();
		System.out.println("Test ClassB.");
		b.m1();
		b.m2();
		b.m3();
		b.m4();

		ClassA b0 = new ClassB();
		System.out.println("Test_0 ClassB.");
		b0.m1();
		b0.m2();
		b0.m3();
		b0.m4();
		((ClassB)b0).m5();
	}
}