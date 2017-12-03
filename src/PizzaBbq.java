
public class PizzaBbq extends Pizza {

	@Override
	public void prepareMasa() {
		System.out.println("Soy masa de barbacoa");
	}

	@Override
	public void addIngredients() {
		System.out.println("Le hecho carne y muchas cosas");
	}

	@Override
	public void cokePizza() {
		System.out.println("La meto en el horno, la pizza");
	}

}
