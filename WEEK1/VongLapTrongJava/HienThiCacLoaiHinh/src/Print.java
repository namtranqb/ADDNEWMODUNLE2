
import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square ");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("choice draw:");
            int choice =sc.nextInt();

            switch (choice){
                case 1:{
                    System.out.println("Print the rectangle");
                    int width,height;
                    System.out.println("Input width:");
                    width = sc.nextInt();
                    System.out.println("Input height:");
                    height = sc.nextInt();
                    for(int i = 0;i<width;i++){
                        System.out.println();
                        for(int j = 0;j < height;j++){
                            System.out.print("NNN");
                        }
                    }
                    System.out.println();
                    break;
                }
                case 2:{
                    System.out.println("Print the square ");
                    int width;
                    System.out.println("Input width:");
                    width = sc.nextInt();
                    for(int i = 0;i < width;i++){
                        System.out.println();
                        for(int j = 0;j < width;j++){
                            System.out.print("NNN");
                        }
                    }
                    System.out.println();
                    break;
                }
                case 3:{
                    System.out.println("Print the triangle");
                    int width;
                    System.out.print("Input wide:");
                    width = sc.nextInt();
                    System.out.print("bottom-left:");
                    for(int i = 0; i < width;i++){
                        System.out.println();
                        for(int j = 0;j <= i;j++)
                            System.out.print("N");
                    }
                    System.out.println();
                    System.out.print("top-left:");
                    for(int i = width; i > 0;i--){
                        System.out.println();
                        for(int j = i;j > 0;j--)
                            System.out.print("N");
                    }
                   System.out.println();
                   System.out.print("isosceles triangle:");
                    for(int i = 0;i < width;i++)
                    {
                        System.out.println();
                        for(int j = width;j > i;j--)
                            System.out.print(" ");
                        for(int k=0;k < i;k++)
                        {
                            System.out.print(" N");
                        }
                    }
                    System.out.println();
                    System.out.print("isosceles triangle:");
                    for(int i = 0;i < width;i++)
                    {
                        System.out.println();
                        for(int j = 0;j < i;j++)
                            System.out.print(" ");
                        for(int k=width;k > i;k--)
                        {
                            System.out.print(" N");
                        }
                    }
                    System.out.println();
                    break;

                }
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }

        }
    }
}
