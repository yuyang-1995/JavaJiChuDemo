  /**
  *Author:余洋
  *Date:2019年4月3日 
  *Time:下午4:46:46
  *Declaration: All Rights Reserved !!!
  */
  package day02test02;
  
//  2编程题1
//  定义一个丈夫Husband类，有姓名、年龄、妻子属性
//  定义一个妻子Wife类，有姓名、年龄、丈夫属性
//  丈夫类中有一个getInfo方法，其中，能显示自己的姓名，年龄，和他的妻子的姓名，年龄
//  妻子类中有一个getInfo方法，其中，能显示自己的姓名，年龄，和她的丈夫的姓名，年龄
//  定义一个测试类，创建妻子和丈夫对象，然后测试
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
		return this.toString() + "\n" +"wife的信息为：" + wife.toString();
		  
	  }
	  
	  @Override
	public String toString() {
		return "[name=" +name+  "  age=" +age+  "]";
	}

}
