  /**
  *Author:����
  *Date:2019��4��3�� 
  *Time:����4:33:46
  *Declaration: All Rights Reserved !!!
  */
  package day02test01;
  public class StudentTest {

	public static void main(String[] args) {

		Student student = new Student();
		
		student.age=20;
		student.gender="��";
		student.id=10;
		student.score=99;
		student.name = "test";
		
		String temp = student.say();
		
		System.out.println(temp);
		//
	}

}
