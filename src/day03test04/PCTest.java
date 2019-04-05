  /**
  *Author:余洋
  *Date:2019年4月4日 
  *Time:下午11:11:18
  *Declaration: All Rights Reserved !!!
  */
  package day03test04;

import java.beans.Customizer;

import day02test03.Customer;


//  生产者(Productor)将产品交给店员(Clerk)，而消费者(Customer)从店员处
//  取走产品，店员一次只能持有固定数量的产品(比如:20），如果生产者试图
//  生产更多的产品，店员会叫生产者停一下，如果店中有空位放产品了再通
//  知生产者继续生产；如果店中没有产品了，店员会告诉消费者等一下，如
//  果店中有产品了再通知消费者来取走产品。
//  这里可能出现两个问题：
//  生产者比消费者快时，消费者会漏掉一些数据没有取到。
//  消费者比生产者快时，消费者会取相同的数据。
  public class PCTest {
	  
	  public static void main(String[] args) {
		
		  Clerk c = new Clerk();
		  
		 Productor r1 = new Productor(c);
		  
		  Consumer r2 = new Consumer(c);
		  
		  Thread t1 = new Thread(r1);
		  Thread t2 = new Thread(r2);
		  
		  t1.setName("生产者");
		  t2.setName("消费者");
		  
		  t1.start();
		  t2.start();
		  
	}

}
  
   class Clerk{
	   
	   int product;
	   
	     synchronized void getP() {
	    	 
	    	 if (this.product <= 0) {
	    		 try {
	    			 
	    		 wait();
	    		
	    		 } catch (InterruptedException e) {
	    		   e.printStackTrace();
	    		 }}
	    	 else {
	    		 System.out.println("消费者取走了第" + 
	    		 product + "个产品");
	    		 product--;
	    		 notifyAll();
	    		      }
	    		 }
	     
	   
	   
	    synchronized  void addP() {
	    	if (product >= 20) {
	    		try {
	    		wait();
	    		} catch (InterruptedException e) 
	    		{
	    		e.printStackTrace();}
	    		} else {
	    		product++;
	    		System.out.println("生产者生产了第" + product + "个产品");
	    		notifyAll();
	   }
   } }

  
    class Productor implements Runnable{
    	
    	Clerk c;
    	public Productor(Clerk c) {
			// TODO Auto-generated constructor stub
    		this.c = c;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("生产者开始生产产品");
			while (true) {
				try {Thread.sleep((int) Math.random() * 1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
					}
				c.addP();
				}	
		}	
    } 
    
    class Consumer implements Runnable{
          
    	Clerk c;
    	public Consumer(Clerk c) {
			// TODO Auto-generated constructor stub
    		this.c = c;
		}
    	
		@Override
		public void run() {
			// TODO Auto-generated method stu
			System.out.println("消费者开始取走产品");
			while (true) {
			try {
			Thread.sleep((int) Math.random() * 1000);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
			c.getP();
			}
			
		}
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    