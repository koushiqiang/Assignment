//具体建造者A,执行通用方法，提供自己的产品
public class SubMealBuilderA extends MealBuilder {
	
	private Meal meal = new Meal();
	public void buildFood() {
		meal.setFood("Hamburg");
		
	}

	public void buildDrink() {
		meal.setDrink("Juice");
		
	}
	
	public Meal getMeal(){
		
		 return meal;
	}
	
}
