  /**
  *Author:����
  *Date:2019��4��3�� 
  *Time:����10:58:59
  *Declaration: All Rights Reserved !!!
  */
  package day02test05;
  
//  дһ���˵���
//  ���ԣ����֣��Ա����䣻�ṩ�޲εĹ�������һ���вεĹ�����
//  ��������1�����ҽ��ܵķ�����2���Է��ķ���
//  ����һ������������

  public class Person {
	  String name;
	  int age;
	  
	  public Person() {
		// TODO Auto-generated constructor stub
		  System.out.println("�޲ι�������������");
	}
	  

	  public Person(String name, int age) {
		  //this();
		  this.name = name;
		  this.age = age;
	}
	  
	   void jieshao(){
		  
		   System.out.println("����" + this.name + "��" + this.age + "���ˣ�");
		  
	  }
	   
	   public static void main(String[] args) {
		   Person p = new Person("Сǿ", 21);
		   
		   p.jieshao();
		
	}
	   

	  
	  
}
