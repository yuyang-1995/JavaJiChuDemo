  /**
  *Author:余洋
  *Date:2019年4月3日 
  *Time:下午4:33:46
  *Declaration: All Rights Reserved !!!
  */
  package day02test01;
  public class StudentTest {

	public static void main(String[] args) {

		Student student = new Student();
		
		student.age=20;
		student.gender="男";
		student.id=10;
		student.score=99;
		student.name = "test";
		
		String temp = student.say();
		
		System.out.println(temp);
		//
	}

}
