public class BubbleSort {
    public void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length -1; j >i ; j--) {
                if(arr[j] < arr[j -1]){
                    int temp = arr[j -1];
                    arr[j -1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public void display(int[] arr){
        for (int o:arr) {
            System.out.print(o+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {21,1,3,5,2,32,6,8,9,7};
        BubbleSort bS = new BubbleSort();
        bS.bubbleSort(arr);
        bS.display(arr);
    }
}
