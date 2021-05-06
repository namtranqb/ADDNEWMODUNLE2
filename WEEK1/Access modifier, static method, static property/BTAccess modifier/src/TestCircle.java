import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Circle test = new Circle();
        Scanner sc = new Scanner(System.in);
        System.out.println("input radius:");
        double radius = sc.nextDouble();
        test.setRadius(radius);
        System.out.println("Area:"+test.getArea());
    }
}
