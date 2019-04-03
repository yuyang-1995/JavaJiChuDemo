  /**
  *Author:余洋
  *Date:2019年4月3日 
  *Time:下午10:58:59
  *Declaration: All Rights Reserved !!!
  */
  package day02test05;
  
//  写一个人的类
//  属性：名字，性别，年龄；提供无参的构造器和一个有参的构造器
//  方法：（1）自我介绍的方法（2）吃饭的方法
//  创建一个对象“张三”

  public class Person {
	  String name;
	  int age;
	  
	  public Person() {
		// TODO Auto-generated constructor stub
		  System.out.println("无参构造器被调用了");
	}
	  

	  public Person(String name, int age) {
		  //this();
		  this.name = name;
		  this.age = age;
	}
	  
	   void jieshao(){
		  
		   System.out.println("我是" + this.name + "我" + this.age + "岁了！");
		  
	  }
	   
	   public static void main(String[] args) {
		   Person p = new Person("小强", 21);
		   
		   p.jieshao();
		
	}
	   

	  
	  
}
