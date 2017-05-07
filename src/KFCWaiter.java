//指挥者，隔离客户和生产过程，负责控制产品的生成过程
public class KFCWaiter {
	private MealBuilder mb;
	
	public void setMealBuilder(MealBuilder mb){
		this.mb = mb;
	}
	
	public Meal Construct(){
		mb.buildDrink();
		mb.buildFood();
		return mb.getMeal();
	}
	

}
