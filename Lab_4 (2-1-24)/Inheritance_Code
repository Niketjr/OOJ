import java.util.*;
abstract class shape{
    double a, b;
    shape(double i, double j){
        a = i;
        b = j;
    }
    abstract void printarea();
}
class triangle extends shape{
    triangle(double a, double b){
        super(a,b);
    }
    void printarea(){
        System.out.println("Area of triangle is:"+ 0.5*super.a*super.b);
    }
}

class rectangle extends shape{
    rectangle(double a, double b){
        super(a,b);
    }
    void printarea(){
        System.out.println("Area of rectangle is:"+ super.a*super.b);
    }
}

class circle extends shape{
    circle(double a, double b){
        super(a,b);
    }
    final double pi = 3.14;
    void printarea(){
        System.out.println("Area of circle is:"+ Math.pow(super.a,2)*pi);
    }
}
class main{
    public static void main(String args[]){
        double a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter height of triangle:");
        a = sc.nextDouble();
        System.out.print("\nEnter base of triangle:");
        b = sc.nextDouble();
        triangle t = new triangle(a,b);
        t.printarea();
        
        System.out.print("\nEnter length of rectangle:");
        a = sc.nextDouble();
        System.out.print("\nEnter width of rectangle:");
        b = sc.nextDouble();
        rectangle r = new rectangle(a,b);
        r.printarea();
        
        System.out.print("\nEnter radius of circle:");
        a = sc.nextDouble();
        circle c = new circle(a,1);
        c.printarea();
        
        
    }
}
