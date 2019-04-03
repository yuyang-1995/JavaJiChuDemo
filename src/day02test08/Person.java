  /**
  *Author:余洋
  *Date:2019年4月3日 
  *Time:下午11:38:32
  *Declaration: All Rights Reserved !!!
  */
  package day02test08;

import java.security.spec.PSSParameterSpec;
import java.util.Date;


/*  定义一个person类，属性如下：
  （1）身份证号，性别，姓名，年龄，户籍，出生日期（Data类型，需要引用java.uitl.Data）功能：
  （2）自我介绍：介绍格式：（toString）
  身份证号+姓名+户籍
  （3）提供对象比较equals方法，只要身份证号+姓名相同就认为对象相等*/
  public class Person {
	  
	  String name;
	  int age;
	  Date bDay;
	  
	  public Person(String name, int age, Date bDay) {
		// TODO Auto-generated constructor stub
		  this.name = name;
		  this.age = age;
		  this.bDay = bDay;  
	}
	  
	  
	  
//	  SimpleDateFormat sdf = new SimpleDateFormat(format);
//	  15             date = sdf.parse(dateStr);
	  
	  @Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name +" "+ this.age + " "+this.bDay;
	}
	  
	  @Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		  
		  if (obj instanceof Person) {
			   Person p = (Person) obj;
			  
			  if (name.equals(p.name) && age == p.age) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
		
	}
	  
	  public static void main(String[] args) {
		
		  
		  Person p1 = new Person("小强", 21, new Date());
		  Person p2 = new Person("小红", 22, new Date());
		  Person p3 = new Person("小强", 21, new Date());
		  
		  System.out.println(p1.toString());
		  System.out.println(p2.toString());
		  System.out.println(p3.toString());
		  
		  
		   boolean b1 = p1.equals(p2);
		   boolean b2 =  p1.equals(p3);
		   
		   System.out.println("b1==b2" + b1 + "  b1==b3" + b2);
		  
		  
	}

}
