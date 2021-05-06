import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {
        float width;
        float heigh;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        width = scanner.nextFloat();
        System.out.println("Enter height: ");
        heigh = scanner.nextFloat();
        float area = width * heigh;
        System.out.println("Area is: "+area);
    }
}
