package org.jdk8testprogram.methodreference;

public class ConstructorReferenceMain {
    public static void main(String[] args) {
        Messageable ms = ConstructorReference::new;
        ms.getMessage("Hello");


    }
}
