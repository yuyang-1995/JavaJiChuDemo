  /**
  *Author:����
  *Date:2019��4��3�� 
  *Time:����11:17:41
  *Declaration: All Rights Reserved !!!
  */
  package day02test07;

import org.junit.Test;

/* ��Ҫ��ʵ���������⣺ʵ��һ����ΪPerson�������������Employee��Employee����������Faculty��Staff������Ҫ�����£�
  1��Person���е������У�����name��String���ͣ�����ַaddress��String���ͣ���
  �绰����telphone��String���ͣ��͵����ʼ���ַemail��String���ͣ���
  2��Employee���е������У��칫��office��String���ͣ�������wage��double
  ���ͣ����ܹ�����hiredate��String���ͣ���
  3��Faculty���е������У�ѧλdegree��String���ͣ�������level��String���ͣ���
  4��Staff���е������У�ְ��ƺ�duty��String���ͣ���
  5�����ж���Person p1 =new Faculty()��Person p2 =new Staff ()����ֱ�Ϊp1�����Ը�ֵ�����ơ���Staff���duty��ֵ��ְԱ��*/
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
