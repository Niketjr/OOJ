import java.util.*;
class Subject{
	int marks;
	int credits;
	int grade;
}
class Student{
	Subject subject[];
	String name;
	String usn;
	double sgpa;
	Scanner s = new Scanner(System.in);
	Student(){
		subject = new Subject[9];
		for(int i=0;i<8;i++)
			subject[i] = new Subject();
	}
	void getStudentDetails(){
		System.out.print("Enter name:");
		name = s.nextLine();
		System.out.print("Enter usn:");
		usn = s.nextLine();
	}
	void getMarks(){
		for(int i=0;i<8;i++){
			System.out.print("Enter marks:");
			subject[i].marks = s.nextInt();
			System.out.print("Enter credits:");
			subject[i].credits = s.nextInt();
			if(subject[i].marks>=40 && subject[i].marks<50)
				subject[i].grade = 5;
			else if(subject[i].marks>=50 && subject[i].marks<60)
				subject[i].grade = 6;
			else if(subject[i].marks>=60 && subject[i].marks<70)
				subject[i].grade = 7;
			else if(subject[i].marks>=70 && subject[i].marks<80)
				subject[i].grade = 8;
			else if(subject[i].marks>=80 && subject[i].marks<90)
				subject[i].grade = 9;
			else if(subject[i].marks>=90 && subject[i].marks<100)
				subject[i].grade = 10;
		}
	}
	void SGPA(){
		double sum = 0,num;
		for(int i=0;i<8;i++){
			num = subject[i].marks * subject[i].credits;
			sum += num;
		}
		sgpa = sum/20.00;
	}
	void display(){
		System.out.println("Student's name is "+name);
		System.out.println("Student's usn is "+usn);
		System.out.println("Student's SGPA is "+sgpa);
	}
}
class main{
	public static void main(String args[]){
		Student s = new Student();
		s.getStudentDetails();
		s.getMarks();
		s.SGPA();
		s.display();
	}
}
