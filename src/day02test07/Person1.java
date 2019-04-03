  /**
  *Author:余洋
  *Date:2019年4月3日 
  *Time:下午11:17:41
  *Declaration: All Rights Reserved !!!
  */
  package day02test07;

import org.junit.Test;

/* 按要求实现下列问题：实现一个名为Person的类和它的子类Employee，Employee有两个子类Faculty和Staff。具体要求如下：
  1）Person类中的属性有：姓名name（String类型），地址address（String类型），
  电话号码telphone（String类型）和电子邮件地址email（String类型）；
  2）Employee类中的属性有：办公室office（String类型），工资wage（double
  类型），受雇日期hiredate（String类型）；
  3）Faculty类中的属性有：学位degree（String类型），级别level（String类型）；
  4）Staff类中的属性有：职务称号duty（String类型）。
  5）现有对象Person p1 =new Faculty()和Person p2 =new Staff ()，请分别为p1的属性赋值“本科”和Staff类的duty赋值“职员”*/
  public class Person1 {
	  
	  String name, address, phone, email;
	 
	  

}
  
  class Employee extends Person1{
	  
	  String office;
	  double wage;
	  String hiredate;
	  
	  
	  
	  
  }
  
  class Faculty extends Employee{
	  
	  String degree;
	  String level;
	  
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	  
	  
  }
  
  
  class Staff extends Employee{
	  String duty;
	  
  }
