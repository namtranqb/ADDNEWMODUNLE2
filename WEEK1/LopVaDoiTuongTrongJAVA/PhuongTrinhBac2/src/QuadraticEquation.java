import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public void setABC(double a,double b,double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }

    public double getDiscriminant(){
        return b*b -4*a*c;
    }
    public  double getRoot1(){
        return (-b + Math.pow(getDiscriminant(),0.5))/2*a;
    }
    public  double getRoot2(){
        return (-b - Math.pow(getDiscriminant(),0.5))/2*a;
    }
    public void displaySolutions(){
        if (this.getDiscriminant()<0) System.out.println("Pt vo nghiem");
        else if (this.getDiscriminant() == 0) System.out.println("Pt co 1 nghiem: "+ this.getRoot2());
            else System.out.println("Pt 2 nghiem: "+this.getRoot1()+" "+this.getRoot2());
    }

    public static void main(String[] args) {
        QuadraticEquation input = new QuadraticEquation();
        Scanner sc = new Scanner(System.in);
        System.out.println("input a:");
        double a = sc.nextDouble();
        System.out.println("input b:");
        double b = sc.nextDouble();
        System.out.println("input c:");
        double c = sc.nextDouble();
        input.setABC(a,b,c);
        input.displaySolutions();

    }
}
