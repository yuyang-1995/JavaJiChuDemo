/**
  *Author:����
  *Date:2019��4��3�� 
  *Time:����5:39:14
  *Declaration: All Rights Reserved !!!
  */
  package day02test03;
  
  // �ڲ�����Bank�д��������˻��������û�����󣬲�������Ϣ������ʾ��Ϣ*/
  public class Bank {

	public static void main(String[] args) {
		
		Customer customer = new Customer("Сǿ", 2019, "110", "����");
		Account account = new Account(1, 100.0, customer);
		
		String temp =  account.getInfo();
		System.out.println(temp);

	}

}
