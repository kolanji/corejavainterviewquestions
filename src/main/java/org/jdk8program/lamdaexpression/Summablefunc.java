package org.jdk8program.lamdaexpression;

public class Summablefunc {
    public static void main(String[] args) {
        Summable sumType = (a, b) -> a + b;
        int result = sumType.sum(5, 6);
        System.out.println("result=" + result);
    }
}
