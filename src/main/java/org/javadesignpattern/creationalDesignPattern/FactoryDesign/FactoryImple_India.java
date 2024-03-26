package org.javadesignpattern.creationalDesignPattern.FactoryDesign;

public class FactoryImple_India implements FactoryMethod_Currency {

	@Override
	public String getCurrency() {
		return "Indian Rupee";
	}

	@Override
	public String getSymbol() {
		return "RS";
	}
}
