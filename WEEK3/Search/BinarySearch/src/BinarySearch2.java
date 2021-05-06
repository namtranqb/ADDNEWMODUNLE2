import java.util.Arrays;

public class BinarySearch2 {
    public int binarySearch(int[] arr, int value){
        int low = 0;
        int high = arr.length -1;
        while(high >= low){
            int mid = low +(high - low)/2;
            if(arr[mid] > value){
                high = mid -1;
            }else
                if(arr[mid] < value){
                    low = mid +1;
                }else
                    return mid;
        }
        return -1;
    }
    public void display(int[] arr){
        for (int o: arr) {
            System.out.print(o+" ");
        }
    }

    public static void main(String[] args) {
        BinarySearch bS = new BinarySearch();
        int[] arr ={2,3,4,9,1,5,3,6,7,8};
        Arrays.sort(arr);
        bS.display(arr);
        bS.binarySearch(arr,50);
    }
}
