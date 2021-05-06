public class BinarySearchRecursive {
    public static int binarySearchRecursive(int[] arr,int low,int high,int value){
//        bubbleSort(arr);
        insertionSort(arr);
//        nonSelectionSort(arr);
        if(high < low)
            return -1;
        int mid = low + (high - low)/2;
        if(arr[mid] > value){
           return binarySearchRecursive(arr,low,mid -1,value);
        }else
            if(arr[mid] < value){
               return binarySearchRecursive(arr,mid +1,high,value);
            }else
                return mid;



    }

    public static int binarySearchRecursive(int[] arr, int value){
      return  binarySearchRecursive(arr,0,arr.length-1,value);

    }
    public static void bubbleSort(int[] arr){
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr.length -1 - i;j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] arr){
        for(int i = 1; i< arr.length; i++){
            int temp = arr[i];
            int index = i;
            while(index > 0 && arr[index -1] > temp){
                arr[index] = arr[index -1];
                index --;
                display(arr);
                System.out.println();

            }
            if(index != i){
                arr[index] = temp;
            }
            display(arr);
            System.out.println("\n*****************");
        }
    }
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length -1; i++) {
            int minIndex = i;
            for (int j = i +1; j < arr.length ; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void nonSelectionSort(int[] arr){
        for (int i = 0; i < arr.length -1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]){
                    int temp = arr[minIndex];
                    arr[minIndex] = arr[j];
                    arr[j] = temp;
                }
            }

        }
    }

    public static void display(int[] arr){
        for (int o: arr) {
            System.out.print(o+" ");
        }
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        for(int i = 0;i< array.length;i++){
            array[i] =(int) Math.round(Math.random()*100);
        }
        display(array);
        System.out.println("\n**********************");
        insertionSort(array);
        display(array);
//        System.out.println("\n**********************");
//        System.out.println(binarySearchRecursive(array,60));
//        System.out.println("\n**********************");
//        System.out.println(binarySearchRecursive(array,34));
//        System.out.println("\n**********************");
    }


}
