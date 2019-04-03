/**
  *Author:����
  *Date:2019��4��3�� 
  *Time:����5:18:49
  *Declaration: All Rights Reserved !!!
  */
  package day02test03;
  
/* 3//
 ���������˻���Account�������ԣ�����cid�����balance�������û�Customer   
 �����˻���Account�з�����
 ��1��getInfo()������String���ͣ����ؿ�����ϸ��Ϣ
 ��2��ȡǮ����withdraw()������������ƣ����ȡǮ�ɹ�����true��ʧ�ܷ���
 false
 ��3����Ǯ����save()������������ƣ������Ǯ�ɹ�����true��ʧ�ܷ���false
    
 ����Customer�������������֤�š���ϵ�绰����ͥ��ַ������
     Customer���з���say()������String���ͣ��������ĸ�����Ϣ��

 �ڲ�����Bank�д��������˻��������û�����󣬲�������Ϣ������ʾ��Ϣ*/
  public class Account {
	  int cid;
	  double balance;
	  Customer customer;
	  
	  public Account(int cid, double balance, Customer customer) {
		  this.cid = cid;
		  this.balance = balance;
		  this.customer = customer;
	}
	  


	  public String getInfo(){
		  
		  return "Account id="+this.cid + "  Account balance=" + this.balance + "  ���ԣ�" + this.customer.name +"  ���룺" + this.customer.phone;
 		  
	  }
	  
	  //ȡǮ
	  boolean withdrawer(double num) {
		  if (num <= balance) {
			  balance -= num;
				return true;
		}else {
			System.out.println("���㣡");
			 return false;
		}  
		 
	  }
	  
	  //��Ǯ
	  boolean save(double num) {
		  
		if (num>0) {
			balance += num;
			return true;
		}  else {
			System.out.println("��������0�����");
		}
		return false;
		  
		  
	  }

  

}
