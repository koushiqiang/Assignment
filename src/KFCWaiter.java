//ָ���ߣ�����ͻ����������̣�������Ʋ�Ʒ�����ɹ���
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
