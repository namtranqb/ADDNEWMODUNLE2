public class BinarySearch {
    public static int binarySearch(int[] arr, int value){
        insertSort(arr);
        int low = 0;
        int high = arr.length -1;
        while (high >= low){
            int mid = (low + high)/2;
            if(arr[mid] > value){
                high = mid -1;
            }else
                if(arr[mid] < value){
                    low = mid + 1;
                }
                else
                    return mid;
        }
        return -1;
    }

    public static void demo(int[] arr,int value){
        if(arr.length <= 0 ){
            System.out.println("Array is Empty");
        }else
            System.out.println(binarySearch(arr,value));
    }

    public static void insertSort(int[] arr){
        for(int i = 1; i< arr.length; i++){
            int temp = arr[i];
            int index = i;
            while(index > 0 && arr[index -1] > temp){
                arr[index] = arr[index -1];
                index --;

            }
            if(index != i){
                arr[index] = temp;
            }
        }
    }
    public static void display(int[] arr){
        for (int o: arr) {
            System.out.print(o+ " ");
        }
    }

    public static void main(String[] args) {
        int[] array ={1,3,2,4,3,6,7,0,987,34};
        System.out.println("*****************");
        insertSort(array);
        display(array);
        System.out.println("\n*****************");
        demo(array,6);
        System.out.println("\n*****************");
        demo(array,20);

    }

}
