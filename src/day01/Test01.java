  /**
  *Author:����
  *Date:2019��3��30�� 
  *Time:����11:33:11
  *Declaration: All Rights Reserved !!!
  */
  package day01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.junit.Test;


  public class Test01 {
	  
	  ////Ϊ�ֿ���ˮ��սʿ������ս89Сʱ����̼��㹲�����������Сʱ
	  @Test
	  public void test1(){
		  int day;
		  int hour;
		  day = 89/24;
		  hour = 89%24;
			System.out.println("����Ҫ:" + day + "���" + hour + "��Сʱ�������");
	  }
	  
	  //�������ܶ���100���Ժ����ܼ���
	  
	  @Test
	  public void test2() {
		  
		  int num1 = 100%7;
		  
		  switch (num1) {
		case 1:
			System.out.println("������������");
			break;
			
		case 2:
			System.out.println("������������");
            break;
		case 3:
			System.out.println("������������");
    	break;
			
		case 4:
			System.out.println("������������");
            break;
		case 5:
			System.out.println("������������");
     	break;
		case 6:
			System.out.println("����������һ");
            break;
		default:
			break;
		}
		  
		  
		 /* int week = 2;
			week += 100;
			week = week % 7;
			System.out.println("100�������" + week);*/
		  
	  }
	  
	  
	  //�����һ��0~255��Χ�ڵ�������ʮ������ֵ��
	  @Test
	  public void test3() {
		  
		  String str1 = Integer.toBinaryString(60);
		  String str2 = Integer.toHexString(60);
		  
		  System.out.println(str1 + ":"  + str2);
	  }
	  
	  //�Ӽ��̷ֱ������ꡢ�¡��գ��ж���һ���ǵ���ĵڼ���
	  @Test
	  public void test4() {
		  
		  Scanner input = new Scanner(System.in);
			
			System.out.print("�꣺");
			int year = input.nextInt();
			
			System.out.print("�£�");
			int month = input.nextInt();
			
			System.out.print("�գ�");
			int day = input.nextInt();
			
			int days = day;
			
			//��ǰ�漸���µ���������
			switch(month){
				case 12:
					//ǰ��11���µ�������
					//days += ��11�µ�����;
					days += 30;
				case 11:
					//ǰ��10���µ�������
					//days += ��10�µ�����;
					days += 31;
				case 10:
					days += 30;//����
				case 9:
					days += 31;//����
				case 8:
					days += 31;//����
				case 7:
					days += 30;//����
				case 6:
					days += 31;//����
				case 5:
					days += 30;//����
				case 4:
					days += 31;//����
				case 3:
					days += 28;//����
					/*if(����){
						days++;
					}
					*/
					if(year % 4 ==0 && year % 100 != 0 || year%400==0){
						days++;
					}
				case 2:
					days += 31;//һ��
			}
			
			System.out.println(year + "��" + month + "��" + day + "������һ��ĵ�" + days + "��");
			
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
				//days = 31 + ���µ����� + day;
				days = 31 + 28 + day;
				break;
			case 4:
				//days = 31 + ���µ����� + 31 + day;
				days = 31 + 28 + 31 + day;
				break;
			....
		}
		
		if(���� && month >2){
			days++;
		}
		*/
		
	}
	  
	  
	  //������жϹ������£�
    //  ��1����ĳ������ܱ�4���������ܱ�100�������������ꡣ
      //��2����ĳ������ܱ�400��������Ҳ�����ꡣ
	  @Test
	 public void test5() {
		 
		  int year;
		  System.out.println("������ݣ�");
		  Scanner sc = new Scanner(System.in);
		  year = sc.nextInt();
		  
		  if ((year%4==0 & year%100!=0)  | year%400 == 0) {
			
			  System.out.println(year + "��������");
		}
		  
		  else {
			  System.out.println(year + "�겻������");
		  }  
	  }
	  
	  //Ҫ���û�����������a��b�����a�ܱ�b��������a��b����1000�������a���������b��
	  @Test
	  public void test6() {
		  int a,b;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("��������������a��b:");
		  a = sc.nextInt();
		  System.out.println("a=" + a);
		  b = sc.nextInt();
		  System.out.println("b=" + b);
		  
		  if((a%b==0) || ((a+b) > 1000)) {
                 
			  System.out.println("����ǣ�" + a);
			  
		  }else {
			  
			  System.out.println("����ǣ�" + b);
		  }
		  
	  }
	  
	  //ʹ�������ṹʵ�֣�����û��������ַ����࡯������������֡�123����
	  //���������ӭ�㣬�ࡱ�������������Բ����㲻���ࡱ��
	  @Test
	  public void test7() {
		  
		  Scanner sc = new Scanner(System.in);
		  System.out.println("�������֣�");
		  char[] name;
		  name = sc.nextLine().toCharArray();
		  System.out.println("�������룺");
		  int code;
		  
		  
		  code = sc.nextInt();
		  
		  if (name.equals('��') && code == 123) {
			
			  System.out.println("��ӭ�㣬��");
		}else {
			System.out.println("�Բ����㲻����");
		}
		  
		  
	  }
	  
	  //��д���򣺴Ӽ����϶���һ��ѧ���ɼ�������ڱ���score�У�����score��ֵ������Ӧ�ĳɼ��ȼ���
	  //score>=90           �ȼ���A
	  //70=<score<90        �ȼ���B
	 // 60=<score<70        �ȼ���C
		//	  score<60            �ȼ���D
	  @Test
	  public void test8(){
		  int score;
		   System.out.println("����ѧ���ɼ���");
		   Scanner sc= new Scanner(System.in);
		  score = sc.nextInt();
	
		  if (score >= 90) {
			System.out.println("ѧ���ɼ�Ϊ��" + score + "�ȼ�Ϊ: A");
		}else if (score >= 70 && score<90 ) {
			System.out.println("ѧ���ɼ�Ϊ��" + score + "�ȼ�Ϊ: B");
		}else if(score < 60) {
			System.out.println("ѧ���ɼ�Ϊ��" + score + "�ȼ�Ϊ: C");
		}  
	  }
	  
	  
	  //��ax2+bx+c=0���̵ĸ���
	//  ��ax2+bx+c=0���̵ĸ���a,b,c�ֱ�Ϊ�����Ĳ�����
	//		  ���a��0����ô��
	//		  ��1����b2-4ac>0�����������⣻
	//		  ��2����b2-4ac=0������һ���⣻
	//		  ��3����b2-4ac<0�����޽⣻
	//		  ���a=0,b��0����ô��
		//	  ��ʾ1��Math.sqrt(num);  sqrtָƽ����
	  @Test
	  public void test9() {
		  
		  Scanner sc = new Scanner(System.in);
		  System.out.println("һԪ���η��̣�ax^2+bx+c=0");
			System.out.print("���������a��");
			double a = sc.nextDouble();
			
			System.out.print("���������b��");
			double b = sc.nextDouble();
				
			System.out.print("���������c��");
			double c = sc.nextDouble();

			if(a!=0){
				double temp = b*b - 4*a*c;
				if(temp==0){
					double x = -b/(2*a);
					System.out.println("�÷�����һԪ���η�������������ͬ�⣺" + x);
				}else if(temp>0){
					double sqrt = Math.sqrt(temp);
					double x1 = (-b+ sqrt)/(2*a);
					double x2 = (-b- sqrt)/(2*a);
					System.out.println("�÷�����һԪ���η�����������ͬ�⣺" + x1 +"," + x2);
				}else{
					System.out.println("�÷�����һԪ���η�������ʵ����Χ���޽⣡");
				}
			}else{
				if(b!=0){
					double x = -c/b;
					System.out.println("�÷�����һԪһ�η��̣���һ���⣺" + x);
				}else{
					System.out.println("���Ƿ��̣���һ����ʽ");
	                if(c == 0){
	                    System.out.println("��ʽ����");
	         }else{
	               System.out.println("��ʽ������");
	           }
				}
			}
		  
	  }
	  
	  /*
	   * �������뿪��һ�����Ʊ����Ϸ����������ز���һ����λ���Ĳ�Ʊ����ʾ�û�����һ����λ����Ȼ��������Ĺ����ж��û��Ƿ���Ӯ��
		1)����û��������ƥ���Ʊ��ʵ��˳�򣬽���10 000��Ԫ��
		2)����û��������������ƥ���Ʊ���������֣���˳��һ�£����� 3 000��Ԫ��
		3)����û������һ�����ֽ�����˳�������ƥ���Ʊ��һ�����֣�����1 000��Ԫ��
		4)����û������һ�����ֽ������˳�������ƥ���Ʊ��һ�����֣�����500��Ԫ��
		5)����û����������û��ƥ���κ�һ�����֣����Ʊ���ϡ�
		
		��ʾ��ʹ��Math.random() ���������
						Math.random() ����[0,1)��Χ�����ֵ
						Math.random() * 90��[0,90) 
						Math.random() * 90 + 10��[10,100) ���õ�  [10,99]
						ʹ��(int)(Math.random() * 90  + 10)����һ����λ�����������
	   * */
	  @Test
	  public void test10() {
		  
		  int n1 = (int)(Math.random() * 90 + 10);
		  System.out.println("ϵͳ���ɵ���Ϊ��" + n1);
		  int n1ge = n1%10;
		  int n1shi = n1/10;
		  int n2, n2ge, n2shi;
		  
		  
		  System.out.println("�����������������λ���֣�");
		  Scanner sc = new Scanner(System.in);
		  n2 = sc.nextInt();
		  n2ge = n2%10;
		  n2shi = n2/10;
		  if (n2>=100 || n2 <= 9) {
			  System.out.println("��������ȷ����λ������");
		}else {
			
			if (n1==n2) {
				System.out.println("����10000����");
			}else if ((n1ge==n2shi && n1shi == n2ge)) {
				System.out.println("����3000����");
			}else if ((n1ge==n2ge && n1shi!=n2shi) || (n1ge!=n2ge && n1shi == n2shi)) {
				System.out.println("����1000����");
			}else if ((n1ge==n2shi && n1shi!=n2ge) || (n1shi==n2ge && n1ge!=n2shi)) {
				System.out.println("����500����");
			}else {
				System.out.println("�޽�����");
			}	
		}  
	  }
	  
	  /**
	   * �ṩ����1-6�����������Ϊ�����ӵõ��ĵ������������������ͬ����Ϊ���ӡ�
		����������ӵ����ͣ�С�ڻ����9����Ϊ��С����
		����������ӵ����ͣ�����9����Ϊ���󡱡�
		�û����ѡ��Ѻ��ѺС����Ѻ���ӡ�ͨ���жϣ�����ͻ��Ƿ�Ѻ��ȷ��
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
			  result = "����";
		   }
			 if (sum > 9) {
					result= "��";
				}else {
					result= "С";
				}
		   System.out.println("��ѡ�񣺴�С������");
		   Scanner sc = new Scanner(System.in); 
		   String input = sc.next();
		    
		   if (input.equals(result)) {
			 System.out.println("��ϲ�н���");
		}else {
			 System.out.println("û�н���");
		}
		  
	  }
	  
	  /**
	   * 1)���볤�Ϳ���������Σ��磺����4��3, ���������ͼ��
####
####
####
2)����߶ȣ����ֱ�������Ρ��磺����4, ���������ͼ��
#
##
###
####
3)����߶ȣ������ֱ�������Ρ��磺����4, ���������ͼ��
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
	  
	  //��ӡ�žų˷���
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
	  
	  //3000�׳������ӣ�ÿ���һ�롣�ʶ�����������ӻ�С��5�ף�������С����
	  @Test
	  public void test16() {
		  int start = 3000;
		  int days = 0;
		  
		  while(start >= 5) {
			  start /= 2;
			  days++;  
		  }
		  
		  System.out.println("������" + days);
		  
		 /* int day = 0;
			for (int x = 3000; x >= 5; x /= 2) {
				day++;
			}
			System.out.println("day=" + day);*/
	  
	  }
	  
	  //��ӡ1-100֮���13�ı�����ʹ��continue���
	  @Test
	  public void test17() {
		  
		  for (int i = 1; i <= 100; i++) {
			
			  if (i%13==0) {
				
				  continue;
			}
			  System.out.println(i);
			  
		}
	  }
	  
	  //��ѭ����������ӡ�����1+3+5+...+99=?�Ľ��
	  
	  @Test
	  public void test18() {
		  int sum = 0;
		  for (int i = 0; i <= 99; i+=2) {
			  sum+=i;   
		}
		  
		  System.out.println("1+3+5+...+99=" + sum); 
	  }
	  
	  //�����1��100֮�����в��ܱ�3��������;�������Щ�����ĺ�
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
		  System.out.println("��Ϊ��" + sum);
		  
	  }
	  
	/*  ��ӡ���µ�ͼ�Σ�������

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
	  
	  //дһ�������ҳ�4λ����������Ѫ�������
	 // ���磺1260=21*60
	 //    1827=21*87
	  @Test
	  public void test21() {
		  
		  
		  for (int i = 1000; i <= 9999; i++) {
			
			  
		}
		  
	  }
	  
	  /*ɽ����һ�ڸ׿���װ50��ˮ��������15��ˮ���Ϻ��н�С������ɽ��ˮ��ÿ�ο�����5����
	  �ʣ�С����Ҫ������ˮ�ſ��԰�ˮ��������ͨ����̽��������⡣*/
	  @Test
	  public void test22() {
		  int times = 0;
		  final int all = 50;
		  int now = 15;
		  
		  while(now < all) {
			  now += 5;
			  times++;
			  
		  }
		  
		  System.out.println("������" + times + "�������ˮ����");
		 
	  }
	  
	  //ʵ���ж�һ��4λ������ͳ�Ƴ�����������������ٸ�ż�������ٸ������Ĺ���
	  @Test
	  public void test23() {
		  
		  int num;
		  System.out.println("������һ����λ��������:");
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
		  
		  System.out.println("ż������Ϊ��" + n);
		  
	  }
	  
	  
	  
	  
	  

}
