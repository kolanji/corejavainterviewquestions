package org.jdk8testprogram.staticmethodoverride;

public class StaticmethodOverride {


    public void m1() {

        System.out.println("Parent ");
    }

    public static void m2() {

        System.out.println("Parent static ");
    }

    private void test() {

        System.out.println("private methods ");
    }


}
