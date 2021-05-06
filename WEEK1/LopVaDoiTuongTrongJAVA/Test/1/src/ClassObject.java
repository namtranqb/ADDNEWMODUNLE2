
import java.util.Scanner;
public class ClassObject {
    double width;
    double height;
    //    public ClassObject(double width, double height) {
//        this.width = width;
//        this.height = height;
//    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double S(){
        return width*height;
    }
    public double C(){
        return (width+height)/2 ;
    }
    public static void main(String[] args) {
        ClassObject retangle = new ClassObject();
        Scanner sc = new Scanner(System.in);
        System.out.println( " nhap width ");
        double width = sc.nextDouble();
        System.out.println( " nhap height ");
        double height = sc.nextDouble();
        retangle.setWidth(width);
        retangle.setHeight(height);
        System.out.println("dt là :" + retangle.S());
        System.out.println("dt là :" + retangle.C());
    }
}