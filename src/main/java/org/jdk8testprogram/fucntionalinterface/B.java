package org.jdk8testprogram.fucntionalinterface;

public interface B extends A {

	default void display2()  {
		
		System.out.println("Display 2");
	}
}
