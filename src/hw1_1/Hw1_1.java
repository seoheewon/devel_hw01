package hw1_1;
import java.util.Scanner;

public class Hw1_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Info[] info = new Info[6];
		Scanner scan = new Scanner(System.in);
		
		String name;
		int id,grade,k_score,e_score,m_score;
		
		for(int i=1;i<4;i++) {
			System.out.print(i+" �� �л��� �̸� : ");
			name = scan.next();
			System.out.print("�й� : ");
			id = scan.nextInt();
			System.out.print("�г� : ");
			grade = scan.nextInt();
			System.out.print("����� : ");
			k_score = scan.nextInt();
			System.out.print("����� : ");
			e_score = scan.nextInt();
			System.out.print("���м��� : ");
			m_score = scan.nextInt();
			
			info[i] = new Info(name,id,grade,k_score,e_score,m_score);
		}
		
		for(int i=1;i<4;i++) {
			System.out.println(i+"�� �л��� �̸� : "+info[i].getName()+" �й� : "+info[i].getID()
					+" �г� : "+info[i].getGrade()+" �������� : "+info[i].total_score());
		}
	}
}

