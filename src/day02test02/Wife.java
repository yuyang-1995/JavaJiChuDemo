  /**
  *Author:余洋
  *Date:2019年4月3日 
  *Time:下午4:47:36
  *Declaration: All Rights Reserved !!!
  */
  package day02test02;
  
  public class Wife {
	  String name;
	  int age;
	 
	  
	  public Wife(String name, int age) {
		  this.name = name;
		  this.age = age;
		  
	}
	  
	  
	  
	  @Override
		public String toString() {
			return "[name=" +name+  "  age=" +age+  "]";
		}

}
