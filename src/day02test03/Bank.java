/**
  *Author:余洋
  *Date:2019年4月3日 
  *Time:下午5:39:14
  *Declaration: All Rights Reserved !!!
  */
  package day02test03;
  
  // 在测试类Bank中创建银行账户类对象和用户类对象，并设置信息，与显示信息*/
  public class Bank {

	public static void main(String[] args) {
		
		Customer customer = new Customer("小强", 2019, "110", "地球");
		Account account = new Account(1, 100.0, customer);
		
		String temp =  account.getInfo();
		System.out.println(temp);

	}

}
