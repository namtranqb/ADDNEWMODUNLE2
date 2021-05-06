import com.sun.org.apache.xpath.internal.SourceTreeManager;

import java.util.Arrays;
import java.util.Scanner;
public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver:");
        System.out.println("Given a equation as 'a*x + b = 0', please enter constants: ");
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a: ");
        a = scanner.nextDouble();
        System.out.println("input b:");
        b = scanner.nextDouble();
        System.out.println("input c: ");
        c = scanner.nextDouble();
        if(a != 0){
            double solution =(c-b) /a;
            System.out.printf("The solution is: %f!\n",solution);
        }else{
            if(b==0){
                System.out.print("The solution is all x!");
            }else {
                System.out.print("No solution!");
            }
        }

    }

}
