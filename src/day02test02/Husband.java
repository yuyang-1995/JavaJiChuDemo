  /**
  *Author:����
  *Date:2019��4��3�� 
  *Time:����4:46:46
  *Declaration: All Rights Reserved !!!
  */
  package day02test02;
  
//  2�����1
//  ����һ���ɷ�Husband�࣬�����������䡢��������
//  ����һ������Wife�࣬�����������䡢�ɷ�����
//  �ɷ�������һ��getInfo���������У�����ʾ�Լ������������䣬���������ӵ�����������
//  ����������һ��getInfo���������У�����ʾ�Լ������������䣬�������ɷ������������
//  ����һ�������࣬�������Ӻ��ɷ����Ȼ�����
  public class Husband {
	  String name;
	  int age;
	  Wife wife;
	  
	  public Husband(String name, int age, Wife wife) {
	
		  this.name = name;
		  this.age = age;
		  this.wife = wife;
	}
	  
	  
	  String getInfo() {
		return this.toString() + "\n" +"wife����ϢΪ��" + wife.toString();
		  
	  }
	  
	  @Override
	public String toString() {
		return "[name=" +name+  "  age=" +age+  "]";
	}

}
