package day02test01;
  

//	��дһ��Student�࣬����name��gender��age��id��score���ԣ�
	//�ֱ�ΪString��String��int��int��double���͡�
//	��������һ��say����������String���ͣ�����������Ϣ�а�����������ֵ��
//	����һ��StudentTest���е�main�����У�����Student����
	//������say�������������ԣ��������ý����ӡ�����
public class Student {
	String name, gender;
	int age, id;
	double score;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	}
	
	public String say() {
		
		return this.toString();
	}

	@Override
	public String toString() {
		return "[name=" +name+ "  gender=" + gender + "  age=" +age+ "  id="+ id +"  score="+ score +"]";
	}
	
}
