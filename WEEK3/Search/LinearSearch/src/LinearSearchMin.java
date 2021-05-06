public class LinearSearchMin {
    public int minOfArray(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if( arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public int secondMin(int[] arr){
        int secondMin = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < secondMin && arr[i] != minOfArray(arr)){
                secondMin = arr[i];
            }
        }return secondMin;
    }
}
