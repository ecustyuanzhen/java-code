




public class MyAdapter {

	static void drive(car car){
		car.Drive();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			drive(new adapter(new plan()));
			drive(new EvCar());
	}
	

}
//实现需要功能的接口
interface car{	
	int i=1;
	String name();
	void Drive();
}
//采用标准继承类，实现接口
class EvCar implements car{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName();
	}

	@Override
	public void Drive() {
		// TODO Auto-generated method stub
		System.out.print(this.name()+" can run");
		System.out.println();
	}
}
//存在某类不能修改，但是希望能使用接口方法来调用
class plan{
	public String name() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName();
	}
	void fly(){
		System.out.print(this.name()+" can fly");
		System.out.println();
	}
}
//继承了标准接口的适配器类，根据传入的参数来实现接口对应的方法
class adapter implements car{

	plan myplan;
	//静态代理
	public adapter(plan myplan) {	
		this.myplan = myplan;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return myplan.getClass().getSimpleName();
	}

	@Override
	public void Drive() {
		// TODO Auto-generated method stub
		myplan.fly();
	}
	
}
