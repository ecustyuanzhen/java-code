




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
//ʵ����Ҫ���ܵĽӿ�
interface car{	
	int i=1;
	String name();
	void Drive();
}
//���ñ�׼�̳��࣬ʵ�ֽӿ�
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
//����ĳ�಻���޸ģ�����ϣ����ʹ�ýӿڷ���������
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
//�̳��˱�׼�ӿڵ��������࣬���ݴ���Ĳ�����ʵ�ֽӿڶ�Ӧ�ķ���
class adapter implements car{

	plan myplan;
	//��̬����
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
