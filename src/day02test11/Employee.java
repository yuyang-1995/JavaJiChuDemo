  /**
  *Author:����
  *Date:2019��4��4�� 
  *Time:����12:53:09
  *Declaration: All Rights Reserved !!!
  */
  package day02test11;


/***
   * ����Ա����Employee���������������ź͹��ʣ��������㽱�𷽷�bonus����ͨԱ���;�����Ա����
���㽱��ķ���Ϊ����*����ϵ������ͨԱ���Ľ���ϵ��Ϊ1.5��������������Ϊ2����������
�ֱ�ʵ��bonus����������������ԡ�

   * @author 13353
   *
   */
  public  class Employee {
	  
	  String name;
	  String num;
	  double money;
	  
	  double bonus() {
		
		  return money;
		  
		  
	  }
	  
	  public static void main(String[] args) {
		
		  Manager manager = new Manager();
		  manager.money = 2000.0;
		  double d1 = manager.bonus();
		  System.out.println(" " + d1);
		  
		  Ep ep = new Ep();
		  ep.money = 1500.0;
		   double d2 = ep.bonus();
		   System.out.println(" "+ d2);
		   
	}

}
  
   class Manager extends Employee{
	   
	   
	   @Override
	double bonus() {
		// TODO Auto-generated method stub
		return money * 2;
	}
   }
   
   class Ep extends Employee{
	   @Override
	    double bonus() {
		// TODO Auto-generated method stub
		   return money * 1.5;

	}
   }
   
   
   
