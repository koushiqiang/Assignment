//���彨����A,ִ��ͨ�÷������ṩ�Լ��Ĳ�Ʒ
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
