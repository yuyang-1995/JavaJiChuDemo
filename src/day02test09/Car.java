  /**
  *Author:余洋
  *Date:2019年4月4日 
  *Time:上午12:07:42
  *Declaration: All Rights Reserved !!!
  */
  package day02test09;
  /*创建一个汽车类（Car）
  （1）为其定义两个属性：颜色和型号。每个属性都使用private进行封装，为每个属性设置set、get方法。
  （2）为该类创建两个构造方法。第一个为无参的构造方法。第二个为带参构造方法
  （3）重写toString方法，通过toString输出汽车信息。
  （4）重写equals方法，如果汽车的颜色和型号相同就认为是同一辆车。
  （5）实例化两个对象，输出两个对象的信息，比较两个对象是否是同一个对象。*/
  public class Car {
	  
	  private String color;
	  
	  private int num;
	  
	  public static void main(String[] args) {
		
		  Car c1 = new Car("红色", 1101);
		  Car c2 = new Car("红色", 1101);
		  Car c3 = new Car("绿色", 1101);
		  
		  
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
		return "颜色=" +this.color + " 型号="+this.num;
	}
	  

}
