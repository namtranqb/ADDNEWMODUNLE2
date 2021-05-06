import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Scanner;

public class TotalColumn {
    public static void main(String[] args) {
        float[][] matrix2 = TheMatrix.creatMatrix(10);
        TheMatrix.display(matrix2);
        Scanner scanner = new Scanner(System.in);
        int index;
        do {
            System.out.println("Choice column:");
            index = scanner.nextInt();
        } while (1 > index || index > 10);

        float total = totalColumn(index-1,matrix2);
        System.out.println("Total of column: "+total);
        float totalMc = totalMainCross(matrix2);
        System.out.println("Total of Main cross: "+ totalMc);
    }
    static float totalColumn(int number,float[][] temp){
        int j = number;
        float total = 0f;
        for(int i =0;i<temp.length;i++){
            total += temp[i][j];
        }
        return total;
    }
    static float totalMainCross(float[][] temp){
        float total = 0f;
        for(int i = 0;i<temp.length;i++){
            total += temp[i][i];
        }
        return total;
    }


}
