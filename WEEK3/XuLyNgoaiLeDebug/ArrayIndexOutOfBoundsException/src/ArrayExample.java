import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println(" Danh sach phan tu: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i]+ " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhap phan tu bat ky: ");
        int x = sc.nextInt();
        try{
            System.out.println("Gia tri phan tu "+x+" la: "+arr[x]);

        }catch (IndexOutOfBoundsException e){
            System.out.println("Chi so vuot gioi han mang");
        }
    }
}
