package day02test02;

public class TestD2T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Wife wife = new Wife("С��", 32);
		Husband husband = new Husband("Сǿ", 34, wife);
		
		String msg =  husband.getInfo();
				
		System.out.println("���˵���ϢHusbandΪ:" + msg);
	}

}
