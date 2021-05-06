import java.util.Arrays;
import java.util.Scanner;

public class DeleteValue {
    public static void main(String[] args) {
        int sizeArray;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("input size array:");
            sizeArray = sc.nextInt();
        }while (sizeArray < 0);

        int[] array = creatArray(sizeArray);
        System.out.println("Array: "+Arrays.toString(array));



        System.out.println("\ninput find value in Array:");
        int value = sc.nextInt();
        int check = checkArray(value,array);
        if(check== -1){
            System.out.println("Not found!");
        }else{
            System.out.println("Found at: "+(check+1));
            int[] newArray1 = deleteValue(check,array);
            System.out.println("New Array:"+Arrays.toString(newArray1));

        }
    }

    public static int[] creatArray(int number) {
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            arr[i] = (int) Math.round(Math.random() * 100);
        }
        return arr;
    }
    static int checkArray(int x,int[] arr){
        for(int i = 0; i<arr.length;i++) {
            if (x == arr[i])
                return i;
        }
        return -1;
    }


    public  static int[] deleteValue(int index,int[] arr){
        for(int i = index;i<arr.length-1;i++){
                arr[i] = arr[i+1];
        }
            arr[arr.length-1] = 0;
        return arr;
    }



}

