
public class Client {
	public static void main(String[] args) {
		MealBuilder builder = new SubMealBuilderA();

//		MealBuilder builder = new SubMealBuilderB();
		
		KFCWaiter director = new KFCWaiter();
		
		director.setMealBuilder(builder);
		Meal product = director.Construct();
		System.out.println("该客户的食物是："+product.getFood()+",饮品是:"+product.getDrink());

	}
}
