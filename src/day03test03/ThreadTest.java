  /**
  *Author:余洋
  *Date:2019年4月4日 
  *Time:下午10:49:37
  *Declaration: All Rights Reserved !!!
  */
  package day03test03;
  
  //使用两个线程打印 1-100。线程1, 线程2 交替打印
  public class ThreadTest {
	  
	   int a, t;
	   
	  
//	     synchronized boolean say(){
//		    notifyAll();
//	    	System.out.print( Thread.currentThread().getName() + "  "+a++ + " ");
//	    	t++;
//	    	if (t%5==0) {
//				System.out.println();
//			}
//	    	
//	    	try {
//				wait();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//	    	return true;
//	  }
	  
	  public static void main(String[] args) {
		 // ThreadTest t = new ThreadTest();
		  
//		  OThread t1 = new OThread(t);
//		  OThread t2 = new OThread(t);
		  
		  Communication c = new Communication();
		  Thread t1 = new Thread(c);
		  Thread t2 = new Thread(c);
		 
		  t1.setName("t1");
		  t2.setName("t2");
		  
		  t1.start();
		  t2.start();
          
		  
	}

}
  
  class Communication implements Runnable {
	  int i = 1;
	  public void run() {
	  while (true) {
	  synchronized (this) {
	  notify();
	  if (i <= 100) {
	  System.out.println(Thread.currentThread().getName() + 
	  ":" + i++);
	  } else
	  break;
	  try {
	  wait();
	  } catch (InterruptedException e) {
	  e.printStackTrace();
	  }
	  }
	  }
	  }
	  }
  
/*   class OThread extends Thread{
	   ThreadTest t;
	   
	   public OThread(ThreadTest t) {
		// TODO Auto-generated constructor stub
		   this.t = t;
	}
	   
	   @Override
	public void run() {
		while(t.a<=100) {
			t.say(); 
		}
	      
	}
	   
   }*/
