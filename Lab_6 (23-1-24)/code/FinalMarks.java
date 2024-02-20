import CIE.Student;
import CIE.Internals;
import SEE.Externals;
import java.util.Scanner;

class FinalMarks{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name;
        int usn, sem;
	int[] a = new int[5];
	int[] b = new int[5];

        System.out.print("No. of students:");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("Enter name:");
            name = sc.next();
            System.out.print("Enter usn:");
            usn = sc.nextInt();
            System.out.print("Enter semester:");
            sem = sc.nextInt();
            System.out.println("Internals:");
            for(int j=0; j<5; j++){
                System.out.print("Enter marks:");
                a[j] = sc.nextInt();
            }
            System.out.println("Externals:");
            for(int j=0; j<5; j++){
                System.out.print("Enter marks:");
                b[j] = sc.nextInt();
            }
            Internals I = new Internals(name, usn, sem, a);
            Externals E = new Externals(name, usn, sem, b);
            
            int sum1=0, sum2=0;
            for(int k=0;k<5; k++){
                sum1+=a[k];
                sum2+=b[k];
            }
            System.out.println(I.name+" got "+sum1+" in Internals and "+sum2+" in Externals");
        }
    }
}

