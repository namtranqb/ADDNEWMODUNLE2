import java.util.Scanner;

public class CountSutudentsPass {
    public static void main(String[] args) {
        int amount;
        int[] point;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a amount student:");
            amount = sc.nextInt();
            if (amount > 30)
                System.out.println("Size should not exceed 30");
        } while (amount > 30);
        point = new int[amount];
        int i = 0;
        while (i < point.length) {
            System.out.print("Enter a mark for student " + (i + 1) + ": ");
            point[i] = sc.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("List of mark: ");
        for (int j = 0; j < point.length; j++) {
            System.out.print(point[j] + "\t");
            if (point[j] >= 5 && point[j] <= 10)
                count++;
        }
        System.out.print("\nStudents passing: " + count);
    }
}
