  /**
  *Author:����
  *Date:2019��4��4�� 
  *Time:����12:07:42
  *Declaration: All Rights Reserved !!!
  */
  package day02test09;
  /*����һ�������ࣨCar��
  ��1��Ϊ�䶨���������ԣ���ɫ���ͺš�ÿ�����Զ�ʹ��private���з�װ��Ϊÿ����������set��get������
  ��2��Ϊ���ഴ���������췽������һ��Ϊ�޲εĹ��췽�����ڶ���Ϊ���ι��췽��
  ��3����дtoString������ͨ��toString���������Ϣ��
  ��4����дequals�����������������ɫ���ͺ���ͬ����Ϊ��ͬһ������
  ��5��ʵ��������������������������Ϣ���Ƚ����������Ƿ���ͬһ������*/
  public class Car {
	  
	  private String color;
	  
	  private int num;
	  
	  public static void main(String[] args) {
		
		  Car c1 = new Car("��ɫ", 1101);
		  Car c2 = new Car("��ɫ", 1101);
		  Car c3 = new Car("��ɫ", 1101);
		  
		  
	}
	  
	  public Car() {
		// TODO Auto-generated constructor stub
	}
	  
	  public Car(String color, int num) {
			// TODO Auto-generated constructor stub
		  this.color = color;
		  this.num = num;
		}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	  
	  @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "��ɫ=" +this.color + " �ͺ�="+this.num;
	}
	  

}
