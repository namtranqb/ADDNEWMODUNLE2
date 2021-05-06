public class InsertionSort {

    public void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int minIndex = i;
            int temp = arr[i];
            while(minIndex > 0 && arr[minIndex -1] > temp){
                arr[minIndex] = arr[minIndex -1];
                minIndex --;
                display(arr);
                System.out.println();
            }
            if(minIndex != i){
                arr[minIndex] = temp;
            }
            display(arr);
            System.out.println("\n***************");
        }
    }

    public void display(int[] arr){
//        for (int o: arr) {
//            System.out.print(o+ " ");
//        }
    }

    public static void main(String[] args) {
        InsertionSort iS = new InsertionSort();
        int[] arr ={3,5,4,6,45,32,9,10,21};
        iS.insertionSort(arr);
        iS.display(arr);
    }
}
