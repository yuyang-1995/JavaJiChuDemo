  /**
  *Author:����
  *Date:2019��4��5�� 
  *Time:����9:52:24
  *Declaration: All Rights Reserved !!!
  */
  package day04test02;
  public class TestStr {
	  
	  public static void main(String[] args) {
		
		  String a = "123";
		  String b = "123";
		  
		  String c = new String("123");
		  String d = new String("123");
		  
		  System.out.println(a.equals(b));
		  System.out.println(a == b);
		  
		  System.out.println(c.equals(d));
		  System.out.println(c == d);
		  
		  System.out.println(a.equals(c));
		  System.out.println(a == c);
		  
//		  true
//		  true
//		  true
//		  false
//		  true
//		  false
		  
	}

}
