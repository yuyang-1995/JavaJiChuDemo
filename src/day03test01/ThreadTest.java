  /**
  *Author:余洋
  *Date:2019年4月4日 
  *Time:下午8:04:48
  *Declaration: All Rights Reserved !!!
  */
  package day03test01;
  
//  创建两个分线程，让其中一个线程输出1-100之间的偶数，另一
//  个线程输出1-100之间的奇数
  public class ThreadTest {
	  
	  static final int  NUM = 100;
	  
	   public static void main(String[] args) {
		
		   
		   OThread t1 = new OThread();
		
		   int t=0;
		   
		   for (int i = 0; i < NUM; i++) {
			   
			   if (i%2==0) {
				   t++;
				   System.out.print( Thread.currentThread().getName() + "输出偶数：" + i + "   ");
			}
			   
			   if (t%4==0) {
				   System.out.println();
				
			}
			
		}
		   
		   
		   System.out.println();
		   t1.setName("子线程");
		   t1.start();
		  
		   
	}
	  
	  
	  
	  
	

}
  
  class OThread extends Thread{
	  
	  @Override
	public void run() {
		// TODO Auto-generated method stub
		 // for (int i = 0; i < ThreadTest.NUM; i++) {
			  
			  int t=0;
			   
			   for (int i = 0; i < ThreadTest.NUM; i++) {
				   
				   if (i%2!=0) {
					   t++;
					   System.out.print( Thread.currentThread().getName() + "输出奇数：" + i + "  ");
				}
				   
				   if (t%4==0) {
					   System.out.println();
					
				}
				
			
		}		
	}
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
