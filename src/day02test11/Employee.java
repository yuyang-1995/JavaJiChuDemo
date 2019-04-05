  /**
  *Author:余洋
  *Date:2019年4月4日 
  *Time:上午12:53:09
  *Declaration: All Rights Reserved !!!
  */
  package day02test11;


/***
   * 定义员工类Employee，包含姓名、工号和工资，包含计算奖金方法bonus，普通员工和经理都是员工，
计算奖金的方法为工资*奖金系数，普通员工的奖金系数为1.5（常量），经理为2（常量），
分别实现bonus方法，创建对象测试。

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
   
   
   
