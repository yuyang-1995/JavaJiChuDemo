  /**
  *Author:����
  *Date:2019��4��4�� 
  *Time:����8:04:48
  *Declaration: All Rights Reserved !!!
  */
  package day03test01;
  
//  �����������̣߳�������һ���߳����1-100֮���ż������һ
//  ���߳����1-100֮�������
  public class ThreadTest {
	  
	  static final int  NUM = 100;
	  
	   public static void main(String[] args) {
		
		   
		   OThread t1 = new OThread();
		
		   int t=0;
		   
		   for (int i = 0; i < NUM; i++) {
			   
			   if (i%2==0) {
				   t++;
				   System.out.print( Thread.currentThread().getName() + "���ż����" + i + "   ");
			}
			   
			   if (t%4==0) {
				   System.out.println();
				
			}
			
		}
		   
		   
		   System.out.println();
		   t1.setName("���߳�");
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
					   System.out.print( Thread.currentThread().getName() + "���������" + i + "  ");
				}
				   
				   if (t%4==0) {
					   System.out.println();
					
				}
				
			
		}		
	}
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
