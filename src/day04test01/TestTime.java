  /**
  *Author:����
  *Date:2019��4��5�� 
  *Time:����8:01:27
  *Declaration: All Rights Reserved !!!
  */
  package day04test01;
  public class TestTime {
	  
	
	  
	  public static void main(String[] args) {
		  
		//��ʼ����
		  long startTime = 0L;
		  long endTime = 0L;
		  
		  String text = "";
		  StringBuffer buffer = new StringBuffer("");
		  StringBuilder builder = new StringBuilder("");
		  //��ʼ�Ա�
		  startTime = System.currentTimeMillis();
		  for (int i = 0; i < 80000; i++) {
		  buffer.append(String.valueOf(i));
		  }
		  endTime = System.currentTimeMillis();
		  System.out.println("StringBuffer��ִ��ʱ�䣺" + (endTime - startTime));
		  
		  
		  startTime = System.currentTimeMillis();
		  for (int i = 0; i < 80000; i++) {
		  builder.append(String.valueOf(i));
		  }
		  endTime = System.currentTimeMillis();
		  System.out.println("StringBuilder��ִ��ʱ�䣺" + (endTime - startTime));
		  
		  
		  startTime = System.currentTimeMillis();
		  for (int i = 0; i < 80000; i++) {
		  text = text + i;
		  }
		  endTime = System.currentTimeMillis();
		  System.out.println("String��ִ��ʱ�䣺" + (endTime - startTime));
		  
		  /*String str = null;
		  StringBuffer sb = new StringBuffer();
		  sb.append(str);
		  System.out.println(sb.length());//
		  System.out.println(sb);//
		  StringBuffer sb1 = new StringBuffer(str);
		  System.out.println(sb1);//
*/		
	}

}
