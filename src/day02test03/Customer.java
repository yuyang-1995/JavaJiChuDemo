/**
  *Author:����
  *Date:2019��4��3�� 
  *Time:����5:23:42
  *Declaration: All Rights Reserved !!!
  */
  package day02test03;
  
  //����Customer�������������֤�š���ϵ�绰����ͥ��ַ������
 // Customer���з���say()������String���ͣ��������ĸ�����Ϣ��
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
