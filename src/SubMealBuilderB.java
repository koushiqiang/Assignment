//���彨����A,ִ��ͨ�÷������ṩ�Լ��Ĳ�Ʒ
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
