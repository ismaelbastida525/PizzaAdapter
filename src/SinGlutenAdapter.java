
public class SinGlutenAdapter extends Pizza {
	// We make a instance of the class we wanna to adapt
	PizzaSinGluten pizzaToAdapt;
	
	@Override
	public void prepareMasa() {
		pizzaToAdapt.createEspecialMasa();
	}

	@Override
	public void addIngredients() {
		pizzaToAdapt.addIngredientsWithoutGluten();
	}

	@Override
	public void cokePizza() {
		pizzaToAdapt.cockInAnotherForm();
	}

}
