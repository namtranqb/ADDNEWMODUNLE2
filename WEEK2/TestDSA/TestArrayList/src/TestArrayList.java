import java.util.Arrays;

public class TestArrayList {
    public static void main(String[] args) {
        int[] arr = {12,32,323,1212,1,2,3232,54,3,21,56};
        int temp;
        for(int i = 0;i<arr.length;i++)
            for(int j = i+1;j<arr.length;j++){
            while (arr[i] > arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
