  /**
  *Author:余洋
  *Date:2019年3月30日 
  *Time:下午11:33:11
  *Declaration: All Rights Reserved !!!
  */
  package day01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.junit.Test;


  public class Test01 {
	  
	  ////为抵抗洪水，战士连续作战89小时，编程计算共多少天零多少小时
	  @Test
	  public void test1(){
		  int day;
		  int hour;
		  day = 89/24;
		  hour = 89%24;
			System.out.println("共需要:" + day + "天和" + hour + "个小时完成任务！");
	  }
	  
	  //今天是周二，100天以后是周几？
	  
	  @Test
	  public void test2() {
		  
		  int num1 = 100%7;
		  
		  switch (num1) {
		case 1:
			System.out.println("今天是星期三");
			break;
			
		case 2:
			System.out.println("今天是星期四");
            break;
		case 3:
			System.out.println("今天是星期五");
    	break;
			
		case 4:
			System.out.println("今天是星期六");
            break;
		case 5:
			System.out.println("今天是星期天");
     	break;
		case 6:
			System.out.println("今天是星期一");
            break;
		default:
			break;
		}
		  
		  
		 /* int week = 2;
			week += 100;
			week = week % 7;
			System.out.println("100天后星期" + week);*/
		  
	  }
	  
	  
	  //如何求一个0~255范围内的整数的十六进制值，
	  @Test
	  public void test3() {
		  
		  String str1 = Integer.toBinaryString(60);
		  String str2 = Integer.toHexString(60);
		  
		  System.out.println(str1 + ":"  + str2);
	  }
	  
	  //从键盘分别输入年、月、日，判断这一天是当年的第几天
	  @Test
	  public void test4() {
		  
		  Scanner input = new Scanner(System.in);
			
			System.out.print("年：");
			int year = input.nextInt();
			
			System.out.print("月：");
			int month = input.nextInt();
			
			System.out.print("日：");
			int day = input.nextInt();
			
			int days = day;
			
			//加前面几个月的满月天数
			switch(month){
				case 12:
					//前面11个月的总天数
					//days += 第11月的天数;
					days += 30;
				case 11:
					//前面10个月的总天数
					//days += 第10月的天数;
					days += 31;
				case 10:
					days += 30;//九月
				case 9:
					days += 31;//八月
				case 8:
					days += 31;//七月
				case 7:
					days += 30;//六月
				case 6:
					days += 31;//五月
				case 5:
					days += 30;//四月
				case 4:
					days += 31;//三月
				case 3:
					days += 28;//二月
					/*if(闰年){
						days++;
					}
					*/
					if(year % 4 ==0 && year % 100 != 0 || year%400==0){
						days++;
					}
				case 2:
					days += 31;//一月
			}
			
			System.out.println(year + "年" + month + "月" + day + "日是这一年的第" + days + "天");
			
			/*
			int days = 0;
			switch(month){
			case 1:
				days = day;
				break;
			case 2:
				days = 31 + day;
				break;
			case 3:
				//days = 31 + 二月的天数 + day;
				days = 31 + 28 + day;
				break;
			case 4:
				//days = 31 + 二月的天数 + 31 + day;
				days = 31 + 28 + 31 + day;
				break;
			....
		}
		
		if(闰年 && month >2){
			days++;
		}
		*/
		
	}
	  
	  
	  //闰年的判断规则如下：
    //  （1）若某个年份能被4整除但不能被100整除，则是闰年。
      //（2）若某个年份能被400整除，则也是闰年。
	  @Test
	 public void test5() {
		 
		  int year;
		  System.out.println("输入年份：");
		  Scanner sc = new Scanner(System.in);
		  year = sc.nextInt();
		  
		  if ((year%4==0 & year%100!=0)  | year%400 == 0) {
			
			  System.out.println(year + "年是闰年");
		}
		  
		  else {
			  System.out.println(year + "年不是闰年");
		  }  
	  }
	  
	  //要求用户输入两个数a和b，如果a能被b整除或者a加b大于1000，则输出a；否则输出b。
	  @Test
	  public void test6() {
		  int a,b;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("请输入两个整数a和b:");
		  a = sc.nextInt();
		  System.out.println("a=" + a);
		  b = sc.nextInt();
		  System.out.println("b=" + b);
		  
		  if((a%b==0) || ((a+b) > 1000)) {
                 
			  System.out.println("结果是：" + a);
			  
		  }else {
			  
			  System.out.println("结果是：" + b);
		  }
		  
	  }
	  
	  //使用条件结构实现，如果用户名等于字符‘青’，密码等于数字‘123’，
	  //就输出“欢迎你，青”，否则就输出“对不起，你不是青”。
	  @Test
	  public void test7() {
		  
		  Scanner sc = new Scanner(System.in);
		  System.out.println("输入名字：");
		  char[] name;
		  name = sc.nextLine().toCharArray();
		  System.out.println("输入密码：");
		  int code;
		  
		  
		  code = sc.nextInt();
		  
		  if (name.equals('青') && code == 123) {
			
			  System.out.println("欢迎你，青");
		}else {
			System.out.println("对不起，你不是青");
		}
		  
		  
	  }
	  
	  //编写程序：从键盘上读入一个学生成绩，存放在变量score中，根据score的值输出其对应的成绩等级：
	  //score>=90           等级：A
	  //70=<score<90        等级：B
	 // 60=<score<70        等级：C
		//	  score<60            等级：D
	  @Test
	  public void test8(){
		  int score;
		   System.out.println("输入学生成绩：");
		   Scanner sc= new Scanner(System.in);
		  score = sc.nextInt();
	
		  if (score >= 90) {
			System.out.println("学生成绩为：" + score + "等级为: A");
		}else if (score >= 70 && score<90 ) {
			System.out.println("学生成绩为：" + score + "等级为: B");
		}else if(score < 60) {
			System.out.println("学生成绩为：" + score + "等级为: C");
		}  
	  }
	  
	  
	  //求ax2+bx+c=0方程的根。
	//  求ax2+bx+c=0方程的根。a,b,c分别为函数的参数，
	//		  如果a≠0，那么：
	//		  （1）当b2-4ac>0，则有两个解；
	//		  （2）当b2-4ac=0，则有一个解；
	//		  （3）当b2-4ac<0，则无解；
	//		  如果a=0,b≠0，那么，
		//	  提示1：Math.sqrt(num);  sqrt指平方根
	  @Test
	  public void test9() {
		  
		  Scanner sc = new Scanner(System.in);
		  System.out.println("一元二次方程：ax^2+bx+c=0");
			System.out.print("请输入参数a：");
			double a = sc.nextDouble();
			
			System.out.print("请输入参数b：");
			double b = sc.nextDouble();
				
			System.out.print("请输入参数c：");
			double c = sc.nextDouble();

			if(a!=0){
				double temp = b*b - 4*a*c;
				if(temp==0){
					double x = -b/(2*a);
					System.out.println("该方程是一元二次方法，有两个相同解：" + x);
				}else if(temp>0){
					double sqrt = Math.sqrt(temp);
					double x1 = (-b+ sqrt)/(2*a);
					double x2 = (-b- sqrt)/(2*a);
					System.out.println("该方程是一元二次方法，两个不同解：" + x1 +"," + x2);
				}else{
					System.out.println("该方程是一元二次方法，在实数范围内无解！");
				}
			}else{
				if(b!=0){
					double x = -c/b;
					System.out.println("该方程是一元一次方程，有一个解：" + x);
				}else{
					System.out.println("不是方程，是一个等式");
	                if(c == 0){
	                    System.out.println("等式成立");
	         }else{
	               System.out.println("等式不成立");
	           }
				}
			}
		  
	  }
	  
	  /*
	   * 假设你想开发一个玩彩票的游戏，程序随机地产生一个两位数的彩票，提示用户输入一个两位数，然后按照下面的规则判定用户是否能赢。
		1)如果用户输入的数匹配彩票的实际顺序，奖金10 000美元。
		2)如果用户输入的所有数字匹配彩票的所有数字，但顺序不一致，奖金 3 000美元。
		3)如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖金1 000美元。
		4)如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500美元。
		5)如果用户输入的数字没有匹配任何一个数字，则彩票作废。
		
		提示：使用Math.random() 产生随机数
						Math.random() 产生[0,1)范围的随机值
						Math.random() * 90：[0,90) 
						Math.random() * 90 + 10：[10,100) 即得到  [10,99]
						使用(int)(Math.random() * 90  + 10)产生一个两位数的随机数。
	   * */
	  @Test
	  public void test10() {
		  
		  int n1 = (int)(Math.random() * 90 + 10);
		  System.out.println("系统生成的数为：" + n1);
		  int n1ge = n1%10;
		  int n1shi = n1/10;
		  int n2, n2ge, n2shi;
		  
		  
		  System.out.println("请您随机输入任意两位数字：");
		  Scanner sc = new Scanner(System.in);
		  n2 = sc.nextInt();
		  n2ge = n2%10;
		  n2shi = n2/10;
		  if (n2>=100 || n2 <= 9) {
			  System.out.println("请输入正确的两位整数！");
		}else {
			
			if (n1==n2) {
				System.out.println("奖金10000美金！");
			}else if ((n1ge==n2shi && n1shi == n2ge)) {
				System.out.println("奖金3000美金！");
			}else if ((n1ge==n2ge && n1shi!=n2shi) || (n1ge!=n2ge && n1shi == n2shi)) {
				System.out.println("奖金1000美金！");
			}else if ((n1ge==n2shi && n1shi!=n2ge) || (n1shi==n2ge && n1ge!=n2shi)) {
				System.out.println("奖金500美金！");
			}else {
				System.out.println("无奖励！");
			}	
		}  
	  }
	  
	  /**
	   * 提供三个1-6的随机数，作为掷骰子得到的点数。如果各个点数相同，则为豹子。
		如果三个骰子点数和，小于或等于9，则为“小”。
		如果三个骰子点数和，大于9，则为“大”。
		用户随机选择：押大、押小或者押豹子。通过判断，输出客户是否押正确。
	   */
	  @Test
	  public void test11() {
		  
		  int n1,n2,n3;
		   n1 = (int) (Math.random()*6+1);
		   n2 = (int) (Math.random()*6+1);
		   n3 = (int) (Math.random()*6+1);
		   System.out.println(n1 + " "+ n2 + " " + n3);
		   int sum = n1+n2+n3;
		   String result;
		   if (n1==n2 && n1==n3) {
			  result = "豹子";
		   }
			 if (sum > 9) {
					result= "大";
				}else {
					result= "小";
				}
		   System.out.println("请选择：大，小，豹子");
		   Scanner sc = new Scanner(System.in); 
		   String input = sc.next();
		    
		   if (input.equals(result)) {
			 System.out.println("恭喜中奖！");
		}else {
			 System.out.println("没中奖！");
		}
		  
	  }
	  
	  /**
	   * 1)输入长和宽，输出长方形，如：输入4和3, 将输出如下图形
####
####
####
2)输入高度，输出直角三角形。如：输入4, 将输出如下图形
#
##
###
####
3)输入高度，输出倒直角三角形。如：输入4, 将输出如下图形
####
###
##
#
	   */
	  
	  @Test
	  public void test12() {
		  
		  for (int i = 0; i < 3; i++) {
			
			  for (int j = 0; j < 4; j++) {
				System.out.print("#");
			}
			  System.out.println();
			  
		}
		  
	  }
	  
	  @Test
	  public void test13() {
		  
		  for (int i = 0; i < 4; i++) {
			
			  
			  for (int j = 0; j < (i+1); j++) {
				
				  System.out.print("#");
			}
			  
			  System.out.println();
		}
		  
	  }
	  
	  @Test
	  public void test14() {
		  
		  for (int i = 0; i < 4; i++) {
			  
			  for (int j = 0; j < (4-i); j++) {
				
				  System.out.print("#");
			}
			  
			  System.out.println();
			
		}
	  }
	  
	  //打印九九乘法表
	  @Test
	  public void test15() {
		  
		  for (int i = 0; i < 9; i++) {
			
			  for (int j = 0; j < i+1; j++) {
				
				  System.out.print( (j+1) + "*" + (i+1)  + "=" + ((i+1) * (j+1)));
				  System.out.print("  ");
				  
			}
			  
			  System.out.println();
			  
		}
		  
		  
	  }
	  
	  //3000米长的绳子，每天减一半。问多少天这个绳子会小于5米？不考虑小数。
	  @Test
	  public void test16() {
		  int start = 3000;
		  int days = 0;
		  
		  while(start >= 5) {
			  start /= 2;
			  days++;  
		  }
		  
		  System.out.println("天数：" + days);
		  
		 /* int day = 0;
			for (int x = 3000; x >= 5; x /= 2) {
				day++;
			}
			System.out.println("day=" + day);*/
	  
	  }
	  
	  //打印1-100之间非13的倍数，使用continue语句
	  @Test
	  public void test17() {
		  
		  for (int i = 1; i <= 100; i++) {
			
			  if (i%13==0) {
				
				  continue;
			}
			  System.out.println(i);
			  
		}
	  }
	  
	  //用循环控制语句打印输出：1+3+5+...+99=?的结果
	  
	  @Test
	  public void test18() {
		  int sum = 0;
		  for (int i = 0; i <= 99; i+=2) {
			  sum+=i;   
		}
		  
		  System.out.println("1+3+5+...+99=" + sum); 
	  }
	  
	  //输出从1到100之间所有不能被3整除的数;并输出这些整数的和
	  @Test
	  public void test19() {
		  int sum = 0;
		  int line = 0;
		  for (int i = 0; i <= 100; i++) {
			
			     if ((i%3)!=0) {
					System.out.print(i);
					System.out.print("  ");
					line++;
					sum+=i;	 
				}
			     
			     if (line%5 ==0) {
					System.out.println();
				}
			     
		}
		  System.out.println();
		  System.out.println("和为：" + sum);
		  
	  }
	  
	/*  打印如下的图形：三角形

	   *    1
	   * * *   3
	   * * * * *  5
	   * * * * * * *  7
	   * * * * *  5  2*2+1
	   * * *  3      1*2+1 
	   *   1         0*2+1
	   */  
	  @Test
	  public void test20() {
		  
		  for (int i = 0; i < 4; i++) {
			  
			  for (int j = 0; j < (1+(i*2)); j++) {
				  
				  System.out.print("*  ");
				  
			}
			  
			  System.out.println();
			
		}
		  
		  for (int i = 0; i < 3; i++) {
			  
			  for (int j = 0; j < ((2-i)*2+1); j++) {
				  
				  System.out.print("*  ");
				
			}
			  System.out.println();
			
		}
		  
	  }
	  
	  //写一个程序，找出4位数的所有吸血鬼的数字
	 // 例如：1260=21*60
	 //    1827=21*87
	  @Test
	  public void test21() {
		  
		  
		  for (int i = 1000; i <= 9999; i++) {
			
			  
		}
		  
	  }
	  
	  /*山上有一口缸可以装50升水，现在有15升水。老和尚叫小和尚下山挑水，每次可以挑5升。
	  问：小和尚要挑几次水才可以把水缸挑满？通过编程解决这个问题。*/
	  @Test
	  public void test22() {
		  int times = 0;
		  final int all = 50;
		  int now = 15;
		  
		  while(now < all) {
			  now += 5;
			  times++;
			  
		  }
		  
		  System.out.println("经过：" + times + "次完成挑水任务");
		 
	  }
	  
	  //实现判断一个4位整数，统计出此整数里面包含多少个偶数，多少个奇数的功能
	  @Test
	  public void test23() {
		  
		  int num;
		  System.out.println("请输入一个四位数的整数:");
		  Scanner sc = new Scanner(System.in);
		  num = sc.nextInt();
		  System.out.println("num=" + num);
		  int ge;
		  int shi;
		  int bai;
		  int qian;
		  
		  ge = num%10;
		  qian = num/1000;
		  bai = (num - qian*1000)/100;
		  shi = (num - qian*1000 - bai*100)/10;
		  
		 // ge = num - (qian*1000 + bai*100 + shi*10);
		 
		  System.out.println(ge +"  " + shi+ "  " + bai + "  "+qian);
		  int n=0;
		  
		  if (ge%2==0) {
			n++;
		}
		  if (shi%2==0) {
			n++;
		}
		  if (bai%2 ==0) {
			n++;
		}
		  if (qian%2 == 0) {
			n++;
		}
		  
		  System.out.println("偶数个数为：" + n);
		  
	  }
	  
	  
	  
	  
	  

}
