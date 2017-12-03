
public class Main {
	public static void main(String[] args) {
		System.out.println("Voy a crear una pizza de barbacoa");
		Pizza pizzaBarbacoa = new PizzaBbq();
		pizzaBarbacoa.prepareMasa();
		pizzaBarbacoa.addIngredients();
		pizzaBarbacoa.cookPizza();
		System.out.println();
		
		System.out.println("Mi mujer quiere una carbonara");
		Pizza carbonara = new PizzaCarbonara();
		carbonara.prepareMasa();
		carbonara.addIngredients();
		carbonara.cookPizza();
		System.out.println();
		
		System.out.println("Y mi hijo es celiaco así que quiere una sin gluten");
		Pizza sinGluten = new SinGlutenAdapter();
		sinGluten.prepareMasa();
		sinGluten.addIngredients();
		sinGluten.cookPizza();

	}
}
