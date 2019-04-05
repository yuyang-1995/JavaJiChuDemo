  /**
  *Author:余洋
  *Date:2019年4月4日 
  *Time:下午9:45:44
  *Declaration: All Rights Reserved !!!
  */
  package day03test02;
  
  //银行有一个账户。
//  有两个储户分别向同一个账户存3000元，每次存1000，存3次。每次存完打
//  印账户余额。
//  问题：该程序是否有安全问题，如果有，如何解决？
  public class Bank {
	  

	  int money;
	  
	  
	  synchronized  boolean  save(int m){
		  money += m;
		  System.out.println(Thread.currentThread().getName() + "存入" + m + "元, 余额为：" + money);
	       return true;
		  }
	  
	  public static void main(String[] args) {
		  Bank bank = new Bank();
		 
		  Person p1 = new Person(bank);
		  Person p2 = new Person(bank);
		  
		  p1.setName("p1");
		  p2.setName("p2");
		  
		  p1.start();
		  p2.start();
		  
		  
	}
	  
}
  
   class Person extends Thread{
	   
	   Bank bank;
	   
	   public Person(Bank bank) {
		// TODO Auto-generated constructor stub
		   this.bank = bank;
	}
	   @Override
	public void run() {
		// TODO Auto-generated method stub
		  // Bank b = new Bank();
		   
		   for (int i = 0; i < 3; i++) {
			
			   bank.save(1000);
			   
			   //System.out.println(Thread.currentThread().getName() + "存入：" + 1000"");
			   
		}
		
	}
	   
   }
