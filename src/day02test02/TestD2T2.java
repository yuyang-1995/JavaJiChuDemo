package day02test02;

public class TestD2T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Wife wife = new Wife("小红", 32);
		Husband husband = new Husband("小强", 34, wife);
		
		String msg =  husband.getInfo();
				
		System.out.println("二人的信息Husband为:" + msg);
	}

}
