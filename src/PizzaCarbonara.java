
public class PizzaCarbonara extends Pizza{

	@Override
	public void prepareMasa() {
		System.out.println("Soy masa de carbonara");		
	}

	@Override
	public void addIngredients() {
		System.out.println("Agrego sus cosas y los champi�ones");		
	}

	@Override
	public void cokePizza() {
		System.out.println("La preparo con mucho cari�o");
	}

}
