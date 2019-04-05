  /**
  *Author:余洋
  *Date:2019年4月4日 
  *Time:下午11:53:55
  *Declaration: All Rights Reserved !!!
  */
  package day03test05;

import static org.hamcrest.CoreMatchers.instanceOf;

import org.junit.runner.Runner;

//  15//
//  练 习 模拟银行取钱的问题1.定义一个Account类1）该Account类封装了账户编号（String）
//  和余额（double）两个属性2）设置相应属性的getter和setter方法
//  3）提供无参和有两个参数的构造器 
//  4）系统根据账号判断与用户是否匹配，需提供hashCode()和equals()方法的重写2
//  .提供两个取钱的线程类：小明、小明’s wife 
//1）提供了Account类的account属性和double类的取款额的属性
//  2）提供带线程名的构造器3）run()方法中提供取钱的操作3.在主类中创建线程进行测试。考虑线程安全问题。
  public class Bank {
	  
//	  Account account = new Account("1234567", 10000);
//	  Thread t1 = new WithDrawThread("小明", account, 8000);
//	  Thread t2 = new WithDrawThread("小明's wife", account, 2800);
//	  t1.start();t2.start();
//	  
	   public static void main(String[] args) {
		
		   Account account = new Account("1234567", 10000);
		   Thread t1 = new WithDrawThread("小明", account, 8000);
		   Thread t2 = new WithDrawThread("小明's wife", account, 2800);
		   
		   t1.start();
		   t2.start();
		   
	}
	  
	  

}
  
  class WithDrawThread extends Thread{
	  String name;
	  Account account;
	  double yue;
	  
	  public WithDrawThread(String name, Account account, double yue) {
		  this.name = name;
		  this.account = account;
		  this.yue = yue;
		  
	}
	  
	  @Override
	public void run() {
		  synchronized (account) {
			  if (account.getYue() > yue) {
			  System.out.println(Thread.currentThread().getName() + ":取款成功，取现的金额为：" + yue);
			  try {
			  Thread.sleep(50);
			  } catch (InterruptedException e) {
			  e.printStackTrace();
			  }
			  account.setYue(account.getYue() - yue);
			  } else {
			  System.out.println("取现额度超过账户余额，取款失败");
			  }
			  System.out.println("现在账户的余额为：" + account.getYue());
			  }
	}
	  
	  
  }
  
   class Account{
	   private String bainhao;
	   private double  yue;
	   
	   public Account() {
		// TODO Auto-generated constructor stub
	}
	   public Account(String bainhao, double yue) {
			// TODO Auto-generated constructor stub
		   
		   this.bainhao = bainhao;
		   this.yue = yue;
		}
	   
	 /*  @Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		   if (obj instanceof Account ) {
			 
			   Account ac = (Account) obj;
			   if (this.bainhao.equals(ac.bainhao)) {
				
				   return true;
			}else {
				return false;
			}
			   
		}else {
			return false;
		}
		
	}*/
	   
	   
	public String getBainhao() {
		return bainhao;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bainhao == null) ? 0 : bainhao.hashCode());
		long temp;
		temp = Double.doubleToLongBits(yue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (bainhao == null) {
			if (other.bainhao != null)
				return false;
		} else if (!bainhao.equals(other.bainhao))
			return false;
		if (Double.doubleToLongBits(yue) != Double.doubleToLongBits(other.yue))
			return false;
		return true;
	}
	public void setBainhao(String bainhao) {
		this.bainhao = bainhao;
	}
	public double getYue() {
		return yue;
	}
	public void setYue(double yue) {
		this.yue = yue;
	}	   
   }
