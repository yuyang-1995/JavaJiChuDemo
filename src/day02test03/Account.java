/**
  *Author:余洋
  *Date:2019年4月3日 
  *Time:下午5:18:49
  *Declaration: All Rights Reserved !!!
  */
  package day02test03;
  
/* 3//
 定义银行账户类Account，有属性：卡号cid，余额balance，所属用户Customer   
 银行账户类Account有方法：
 （1）getInfo()，返回String类型，返回卡的详细信息
 （2）取钱方法withdraw()，参数自行设计，如果取钱成功返回true，失败返回
 false
 （3）存钱方法save()，参数自行设计，如果存钱成功返回true，失败返回false
    
 其中Customer类有姓名、身份证号、联系电话、家庭地址等属性
     Customer类有方法say()，返回String类型，返回他的个人信息。

 在测试类Bank中创建银行账户类对象和用户类对象，并设置信息，与显示信息*/
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
		  
		  return "Account id="+this.cid + "  Account balance=" + this.balance + "  来自：" + this.customer.name +"  号码：" + this.customer.phone;
 		  
	  }
	  
	  //取钱
	  boolean withdrawer(double num) {
		  if (num <= balance) {
			  balance -= num;
				return true;
		}else {
			System.out.println("余额不足！");
			 return false;
		}  
		 
	  }
	  
	  //存钱
	  boolean save(double num) {
		  
		if (num>0) {
			balance += num;
			return true;
		}  else {
			System.out.println("请存入大于0的数额！");
		}
		return false;
		  
		  
	  }

  

}
