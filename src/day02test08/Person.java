  /**
  *Author:����
  *Date:2019��4��3�� 
  *Time:����11:38:32
  *Declaration: All Rights Reserved !!!
  */
  package day02test08;

import java.security.spec.PSSParameterSpec;
import java.util.Date;


/*  ����һ��person�࣬�������£�
  ��1�����֤�ţ��Ա����������䣬�������������ڣ�Data���ͣ���Ҫ����java.uitl.Data�����ܣ�
  ��2�����ҽ��ܣ����ܸ�ʽ����toString��
  ���֤��+����+����
  ��3���ṩ����Ƚ�equals������ֻҪ���֤��+������ͬ����Ϊ�������*/
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
		
		  
		  Person p1 = new Person("Сǿ", 21, new Date());
		  Person p2 = new Person("С��", 22, new Date());
		  Person p3 = new Person("Сǿ", 21, new Date());
		  
		  System.out.println(p1.toString());
		  System.out.println(p2.toString());
		  System.out.println(p3.toString());
		  
		  
		   boolean b1 = p1.equals(p2);
		   boolean b2 =  p1.equals(p3);
		   
		   System.out.println("b1==b2" + b1 + "  b1==b3" + b2);
		  
		  
	}

}
