//产品类，根据不同的具体建造者提供的方法，构建出不同的产品
public class Meal {
	private String food;
	private String drink;

	public void setFood(String food){
		this.food = food;
	}
	
	public void setDrink(String drink){
		this.drink = drink;
	}
	
	public String getFood() {
		return food;
	}

	public String getDrink() {
		return drink;
	}
	
}
