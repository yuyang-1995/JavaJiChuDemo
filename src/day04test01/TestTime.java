  /**
  *Author:余洋
  *Date:2019年4月5日 
  *Time:下午8:01:27
  *Declaration: All Rights Reserved !!!
  */
  package day04test01;
  public class TestTime {
	  
	
	  
	  public static void main(String[] args) {
		  
		//初始设置
		  long startTime = 0L;
		  long endTime = 0L;
		  
		  String text = "";
		  StringBuffer buffer = new StringBuffer("");
		  StringBuilder builder = new StringBuilder("");
		  //开始对比
		  startTime = System.currentTimeMillis();
		  for (int i = 0; i < 80000; i++) {
		  buffer.append(String.valueOf(i));
		  }
		  endTime = System.currentTimeMillis();
		  System.out.println("StringBuffer的执行时间：" + (endTime - startTime));
		  
		  
		  startTime = System.currentTimeMillis();
		  for (int i = 0; i < 80000; i++) {
		  builder.append(String.valueOf(i));
		  }
		  endTime = System.currentTimeMillis();
		  System.out.println("StringBuilder的执行时间：" + (endTime - startTime));
		  
		  
		  startTime = System.currentTimeMillis();
		  for (int i = 0; i < 80000; i++) {
		  text = text + i;
		  }
		  endTime = System.currentTimeMillis();
		  System.out.println("String的执行时间：" + (endTime - startTime));
		  
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
