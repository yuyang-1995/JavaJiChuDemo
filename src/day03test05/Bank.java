  /**
  *Author:����
  *Date:2019��4��4�� 
  *Time:����11:53:55
  *Declaration: All Rights Reserved !!!
  */
  package day03test05;

import static org.hamcrest.CoreMatchers.instanceOf;

import org.junit.runner.Runner;

//  15//
//  �� ϰ ģ������ȡǮ������1.����һ��Account��1����Account���װ���˻���ţ�String��
//  ����double����������2��������Ӧ���Ե�getter��setter����
//  3���ṩ�޲κ������������Ĺ����� 
//  4��ϵͳ�����˺��ж����û��Ƿ�ƥ�䣬���ṩhashCode()��equals()��������д2
//  .�ṩ����ȡǮ���߳��ࣺС����С����s wife 
//1���ṩ��Account���account���Ժ�double���ȡ��������
//  2���ṩ���߳����Ĺ�����3��run()�������ṩȡǮ�Ĳ���3.�������д����߳̽��в��ԡ������̰߳�ȫ���⡣
  public class Bank {
	  
//	  Account account = new Account("1234567", 10000);
//	  Thread t1 = new WithDrawThread("С��", account, 8000);
//	  Thread t2 = new WithDrawThread("С��'s wife", account, 2800);
//	  t1.start();t2.start();
//	  
	   public static void main(String[] args) {
		
		   Account account = new Account("1234567", 10000);
		   Thread t1 = new WithDrawThread("С��", account, 8000);
		   Thread t2 = new WithDrawThread("С��'s wife", account, 2800);
		   
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
			  System.out.println(Thread.currentThread().getName() + ":ȡ��ɹ���ȡ�ֵĽ��Ϊ��" + yue);
			  try {
			  Thread.sleep(50);
			  } catch (InterruptedException e) {
			  e.printStackTrace();
			  }
			  account.setYue(account.getYue() - yue);
			  } else {
			  System.out.println("ȡ�ֶ�ȳ����˻���ȡ��ʧ��");
			  }
			  System.out.println("�����˻������Ϊ��" + account.getYue());
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
