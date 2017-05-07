//具体建造者A,执行通用方法，提供自己的产品
public class SubMealBuilderB extends MealBuilder {

	private Meal meal = new Meal();
	public void buildFood() {
		meal.setFood("Chicken");
		
	}

	public void buildDrink() {
		meal.setDrink("Beer");
		
	}
	
	public Meal getMeal(){
		
		 return meal;
	}

}
