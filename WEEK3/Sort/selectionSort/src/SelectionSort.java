public class SelectionSort {
    public void selectionSort(int[] arr){
        for (int i = 0; i < arr.length -1; i++) {
            int minIndex = i;
            for (int j = 1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public void display(int[] arr){
        for (int o: arr) {
            System.out.print(o+ " ");
        }
    }

    public static void main(String[] args) {
        SelectionSort sS = new SelectionSort();
        int[] arr ={3,5,4,6,45,32,9,10,21};
        sS.display(arr);
        System.out.println("\n*********************");
        sS.selectionSort(arr);
        sS.display(arr);
    }

}
