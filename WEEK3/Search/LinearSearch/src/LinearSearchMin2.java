public class LinearSearchMin2 {
    public int secondMinOfArray(int[] arr){
        int min = 0;
        for (int i = 1; i < arr.length; i++) {
            if( arr[i] < arr[min]){
                min = i;
            }
            arr[0] = arr[0] + arr[min];
            arr[min] = arr[0] - arr[min];
            arr[0] = arr[0] - arr[min];
            min = 1;
            for(int j = 2;j< arr.length;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
                return min;
            }
        }
        return arr[min];
    }

    public static void main(String[] args) {
        LinearSearchMin2 min2 = new LinearSearchMin2();
        int[] arr = {2,3,4,3,4,5,6,7,8,9,0,1};
        System.out.println(min2.secondMinOfArray(arr));
    }
}
