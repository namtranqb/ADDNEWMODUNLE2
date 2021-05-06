import java.util.Scanner;

public class TheMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size matrix:");
        int number = sc.nextInt();
        float[][] matrix = creatMatrix(number);
//        String.format("%2.2",matrix);
        display(matrix);
        float maxMatrix = maxMatrix(matrix);
        System.out.println("\nMax of matrix: "+maxMatrix);
    }
    public static float[][] creatMatrix(int number){
        float[][] array = new float[number][number];
        for(int i = 0;i < number;i++){
//            int random =(int) Math.round(Math.random()*20);
            for(int j = 0;j< number;j++){
                 array[i][j] = (float) Math.round( (Math.random()*90+10)*100)/100f;
            }
        }
        return array;
    }
    public static void display(float[][] arr){
        for(int i = 0; i<arr.length;i++) {
            System.out.println();
            for (int j = 1; j < arr[i].length; j++) {
                System.out.printf("%02.2f   ",arr[i][j]);
            }
        }
    }
    static float maxMatrix(float[][] arr){
        float max = arr[0][0];
        for(int i = 0; i<arr.length;i++){
            for(int j = 1;j < arr[i].length;j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
