  /**
  *Author:����
  *Date:2019��4��4�� 
  *Time:����9:45:44
  *Declaration: All Rights Reserved !!!
  */
  package day03test02;
  
  //������һ���˻���
//  �����������ֱ���ͬһ���˻���3000Ԫ��ÿ�δ�1000����3�Ρ�ÿ�δ����
//  ӡ�˻���
//  ���⣺�ó����Ƿ��а�ȫ���⣬����У���ν����
  public class Bank {
	  

	  int money;
	  
	  
	  synchronized  boolean  save(int m){
		  money += m;
		  System.out.println(Thread.currentThread().getName() + "����" + m + "Ԫ, ���Ϊ��" + money);
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
			   
			   //System.out.println(Thread.currentThread().getName() + "���룺" + 1000"");
			   
		}
		
	}
	   
   }
