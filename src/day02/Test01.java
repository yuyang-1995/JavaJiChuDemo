  /**
  *Author:余洋
  *Date:2019年4月1日 
  *Time:上午7:33:51
  *Declaration: All Rights Reserved !!!
  */
  package day02;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;

public class Test01 {
	  
	  
	  //面试题目：创建一个长度为6的int型数组，要求取值为1-30，同时元素值各不相同
	  @Test
	  public void test01() {
		  
		  int[] a = new int[6];
		  System.out.println();
		 /* 
		  for (int i = 0; i < a.length; i++) {// [0,1) [0,30) [1,31)
				a[i] = (int) (Math.random() * 30) + 1;
				
					for (int j = 0; j < i; j++) {
						if (a[i] == a[j]) {
							i--;
							break;
						}
					}
				}

			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}*/
		  
		  for (int i = 0; i < a.length; i++) {
			
			  a[i] = (int)(Math.random()*30 +1);
			  
			  for (int j = 0; j < i; j++) {
				
				  if (a[j] == a[i]) {
					i--;
					break;
					  }  
			}
		}
		  for (int i = 0; i < a.length; i++) {
			
			  System.out.println(a[i]);
		}
		  
		  
	  } 
	  
	  //从键盘输入一个整数（1~20） 
	 /* 则以该数字为矩阵的大小，把1,2,3…n*n 的数字按照顺时针螺旋的形式填入其中。例如： 输入数字2，
	  * 则程序输出：
	  1 2 
	  4 3 
	  输入数字3，则程序输出：
	  1 2 3 
	  8 9 4 
	  7 6 5 
	  输入数字4， 则程序输出： 
	  1   2   3   4 
	  12  13  14  5 
	  11  16  15  6 
	  10   9  8   7
	  */
	  @Test
	  public void test02() {
		  
		 /* System.out.println("输入一个1-20的整数");
		  int input = new Scanner(System.in).nextInt();
		  
		  for (int i = 0; i < input; i++) {
		}*/
		  
	  }
	  
	 /* Arrays工具类的使用
	  练习：
	  1、从键盘输入本组学员的成绩，放到数组中
	  2、用for循环显示所有学员的成绩
	  3、排序：从低到高
4、查找是否有正好60分的，如果有返回位置
5、复制成绩最低三名构成新数组
6、用工具类打印成绩最低三名成绩*/
	  @Test 
	  public void test03() {
		  
		//1、声明一个数组并创建一个数组
			int[] scores = new int[5];
			
			//2、从键盘输入成绩
			Scanner input = new Scanner(System.in);
			for(int i=0; i<scores.length; i++){
				//成绩存在数组的元素中
				//为元素赋值
				System.out.print("请输入第" + (i+1) + "个学员的成绩:");
				scores[i] = input.nextInt();
			}
			
			//3、显示成绩
			//用foreach显示所有学员的成绩
			System.out.println("本组学员的成绩如下：");
			for(int s = 0; s < scores.length;s++){
				System.out.println(scores[s]);
		  
	  }
			//4、排序：从低到高
			Arrays.sort(scores);
			
			System.out.println("排序后的结果：" + Arrays.toString(scores));
			
			//5、查找60分
			int index = Arrays.binarySearch(scores, 60);
			if(index<0){
				System.out.println("没有正好60分的");
			}else{
				System.out.println("60分的索引位置：" + index);
			}
			
			//6、复制成绩最低三名构成新数组
			//int[] newArray = Arrays.copyOfRange(scores, 0, 3);
			int[] newArray = Arrays.copyOf(scores,  3);
			
			//7、用工具类打印成绩最低三名成绩
			System.out.println("成绩最低的三名同学是：" +  Arrays.toString(newArray));
		
	  }
	  
	  //创建一个char类型的26个元素的数组，分别 放置'A'-'Z'。
	//  使用for循环访问所有元素并打印出来。
	  
	  @Test
	  public void test04() {
		  
		  char[] cs = new char[26];
		  
		  for (int i = 0; i < cs.length; i++) {
			
			  cs[i] = (char)(65+i);
			  
		}
		  System.out.println("字符数组为:" + Arrays.toString(cs));
		  
		  
	  }
	  
	  //创建一个char类型的36个元素的数组，前26个元素放置'A'-'Z', 
//	  后10个元素放置'0'-'9'。
//	  使用for循环访问所有元素并打印出来。
//	  提示：char类型数据运算 'A'+1 -> 'B'，'0'+1 -> '1'
	  @Test
	  public void test05() {
		  
		  char[] cs = new char[36];
		  
		  for (int i = 0; i < 26; i++) {
			  
			  cs[i] = (char)(65+i);
			  
		}
		  
		  for (int i = 25 ,j = 0;  i < 36; j++,i++) {
			cs[i] =  (char) j;
		}
		  
		  System.out.println("数组为：" + Arrays.toString(cs));
		  
	  }
	  
	 // 一维数组a[]，用java代码将数组元素顺序颠倒
	  @Test
	  public void test06() {
		  
		  int[] a = new int[10];
	  
		  for (int i = 0; i < a.length; i++) {
			
			  a[i] = (int)(Math.random() * 100 + 1);
			  
			  
		}
		  
		  System.out.println(Arrays.toString(a));
		  
		  for (int i = 0, j=a.length-1; i < j; i++,j--) {
			
			  int temp = 0;
			  temp = a[i];
			  a[i] = a[j];
			  a[j] = temp;
			  
		}
		  System.out.println("交换后");
		  
		  System.out.println(Arrays.toString(a));
		  
	  }
	  
	  //任意一个人输入年龄，就可以判断出他是哪个年龄段的人？
	  /*
	  0-9   儿童
	  10-19 少年
	  20-29 青少年
	  30-39 青年
	  40-49 壮年
	  50-59 中年
	  60-69 中老年
	  70-79 老年
	  80-89 老老年
	  90-99 老老老年
	  */
	  
	  @Test
	  public void test07() {
		  
		  
		  Scanner sc = new Scanner(System.in);
		  System.out.println("请输入年龄：");
		  int age = sc.nextInt();
		  
		 if (age>=0 && age<=9) {
			System.out.println("儿童");
		}else if (age>9 && age <=19) {
			System.out.println("青少年");
		}
		  
		  
	  }
	  
	  //有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
	  
	  @Test
	  public void test08() {
		 
		  int[] a = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,100,200,205};
		  
		  System.out.println("插入前：" + Arrays.toString(a));
		  
		  Scanner sc = new Scanner(System.in);
		  System.out.println("请输入任意整数：");
		  int temp = sc.nextInt();
		  
		  //当插入的数大于最后一位数时
		  if (temp > a[a.length-1]) {
			  
			  int[] b = new int[a.length+1];
			  for (int i = 0; i < a.length; i++) {
				  b[i] = a[i];		
			}
			  
			  b[b.length-1] = temp;
			  System.out.println("插入后：" + Arrays.toString(b));
			  
		}else {
			
			int te = 0;
			for (int i = 0; i < a.length; i++) {
				
				if (a[i] >= temp) {
					
					te = i;
				}
			}
			
			int[] c = new int[te+1];
			int[] d = new int[a.length - te];
			int[] e = new int[a.length+1];
			
			for (int i = 0; i < c.length; i++) {
				if (i == c.length-1) {
					c[i] = temp;
				}else {
					c[i] = a[i];
				}
				
			}
			
			System.out.println("c数组：" + Arrays.toString(c));
			
			for (int i = 0, j=te; i < d.length; i++,j++) {
				d[i] = a[j];
			}
			
			System.out.println("d数组：" + Arrays.toString(d));
			
			/*int[] c = new int[te+1];
			for (int i = 0; i < c.length; i++) {
				
				
				if (i == c.length) {
					c[i] = temp;
				}else {
					c[i] = a[i];
				}
				
			}
			System.out.println("c数组：" + Arrays.toString(c));
			
			
			int[] d = new int[a.length-te];
			for (int i = 0, j=te+1; j < a.length+1; i++, j++) {
				
				d[i] = a[j];
				
			}
			
			System.out.println("d数组：" + Arrays.toString(d));*/
		   for (int i = 0; i < e.length; i++) {
			
			   //将c数组装入e
			   if (i<=c.length) {
				
				   for (int j = 0; j < c.length; j++) {
					
					   e[j] = c[j];
				}
		
			}else {
				
				for (int j = te+1,k=0 ; k < d.length; j++, k++) {
					
					e[j] =  d[k];
				}
			}
		}
		   
		   System.out.println("完成：" + Arrays.toString(e));
			
		}
		  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
		
	  
}
