import java.util.Arrays;
import java.util.Scanner;

public class AddValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size array:");
        int size = sc.nextInt();
        int[] addNew = DeleteValue.creatArray(size);
        System.out.println("Array 1:"+ Arrays.toString(addNew));

        System.out.println();
        System.out.println("Add value in Array:");
        int addValue = sc.nextInt();
        System.out.println("Add index of value in Array:");
        int addIndex = sc.nextInt();
        int[] newArray2 = addValue(addValue,addIndex,addNew);
        System.out.println("New Array2:"+Arrays.toString(newArray2));

    }
    public static int[] addValue(int value,int index,int[] arr){

        System.out.println();
        int k = arr.length -1;
        int[] temp = new int[arr.length+1];
        for( int i = temp.length-1;i >=0;i--){
            if(i != index-1){
                temp[i] =arr[k--];


            }else{
                temp[i]= value;
            }
        }
        return temp;
    }

}
