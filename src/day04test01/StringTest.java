  /**
  *Author:����
  *Date:2019��4��5�� 
  *Time:����6:25:17
  *Declaration: All Rights Reserved !!!
  */
  package day04test01;
  public class StringTest {
	  
	  String str = new String("good");
	  char[] ch = { 't', 'e', 's', 't' };
	  
	  public void change(String str, char ch[]) {
		  str = "test ok";
		  ch[0] = 'b';}
	  
	  public static void main(String[] args){
		  StringTest ex = new StringTest();
	  
		  ex.change(ex.str, ex.ch);
		  System.out.print(ex.str + " and ");//System.out.println(ex.ch);}
	  }

}
