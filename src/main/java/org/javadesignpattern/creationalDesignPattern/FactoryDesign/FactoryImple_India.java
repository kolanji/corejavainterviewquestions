package Java_design_pattern.FactoryDesign_Patter.factory;

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
