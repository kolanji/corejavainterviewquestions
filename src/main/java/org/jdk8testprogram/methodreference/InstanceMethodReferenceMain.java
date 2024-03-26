package org.jdk8testprogram.methodreference;

public class InstanceMethodReferenceMain {
//Refered by javatpoint web
	public static void main(String[] args) {

		Thread t = new Thread(new InstanceMethodReference()::saySomething);
		t.start();
	}
}
