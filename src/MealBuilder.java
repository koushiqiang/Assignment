//Builder 类，抽象建造者，负责提供通用构建过程
public abstract class MealBuilder {
	
	private Meal meal = new Meal();
	
	public abstract void buildFood();
	
	public abstract void buildDrink();
	
	public Meal getMeal(){
		
		 return meal;
	}
}
