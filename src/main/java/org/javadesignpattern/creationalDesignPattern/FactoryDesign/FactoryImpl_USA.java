package org.javadesignpattern.creationalDesignPattern.FactoryDesign;

public class FactoryImpl_USA implements FactoryMethod_Currency {

    @Override
    public String getCurrency() {

        return "Dollar";
    }

    @Override
    public String getSymbol() {
        return "$";
    }

}
