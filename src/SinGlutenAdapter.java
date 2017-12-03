
public class SinGlutenAdapter implements Pizza {
	// We make a instance of the class we wanna to adapt
	PizzaSinGluten pizzaToAdapt;
	
	
	public SinGlutenAdapter() {
		pizzaToAdapt = new PizzaSinGluten();
	}

	@Override
	public void prepareMasa() {
		pizzaToAdapt.createEspecialMasa();
	}

	@Override
	public void addIngredients() {
		pizzaToAdapt.addIngredientsWithoutGluten();
	}

	@Override
	public void cookPizza() {
		pizzaToAdapt.cockInAnotherForm();
	}

}
