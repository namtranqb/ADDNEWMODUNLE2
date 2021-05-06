import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = creatArray();
        System.out.println();
        for(int i:array){
            System.out.print(i+" ");
        }
        System.out.println();
        int max = maxArray(array);
        System.out.println("Max in Array: "+max);

    }
    public static int[] creatArray(){
        int[] arr = new int[10];
        for(int i = 0;i<arr.length;i++){
            arr[i] = (int) Math.round(Math.random()*100);

        }
        return arr;
    }
    public static int maxArray(int[] arr){
        int max = arr[0];
        for(int i = 0;i< arr.length;i++){
            if(max < arr[i])
                max = arr[i];
        }
        return max;

    }
}
