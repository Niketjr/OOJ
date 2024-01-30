import java.util.Scanner;

class WrongAge extends Exception{
	WrongAge(){
		super("Wrong age");
	}
	WrongAge(String message){
		super(message);
	}
}

class father{
	Scanner sc = new Scanner(System.in);
	public int f_age; 
	public father() throws WrongAge{
		System.out.print("Enter father's age:");
		f_age = sc.nextInt();
		if(f_age<0){
			throw new WrongAge("Father's age can't be less than zero");
		}
	}
	public void display(){
		System.out.println("Father's age:"+ f_age);
	}
}

class son extends father{
	Scanner sc = new Scanner(System.in);
	public int s_age;
	public son() throws WrongAge{
		super();
		System.out.print("Enter son's age:");
		s_age = sc.nextInt();
		if(s_age>=f_age){
			throw new WrongAge("Son cant be older than the father!");
		}
		else if(s_age<0){
			throw new WrongAge("Son's age cant be less than zero");
		}
	}
	public void display(){
	    System.out.println("Son's age:"+s_age);
	}
}

class main{
    public static void main(String[] args) {
        try{
            son s = new son();
            
        }
        catch(WrongAge e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
