/**
  *Author:余洋
  *Date:2019年4月3日 
  *Time:下午5:23:42
  *Declaration: All Rights Reserved !!!
  */
  package day02test03;
  
  //其中Customer类有姓名、身份证号、联系电话、家庭地址等属性
 // Customer类有方法say()，返回String类型，返回他的个人信息。
  public class Customer {
	  
	  String name;
	  int id;
	  String phone;
	  String adr;
	  
	  public Customer(String name, int id, String phone, String adr) {
		  this.name = name;
		  this.id = id;
		  this.phone = phone;
		   this.adr = adr;
	}
	  
	  String say() {
		  return this.name + this.id + this.phone + this.adr + "";
	  }
	  
	  
}
