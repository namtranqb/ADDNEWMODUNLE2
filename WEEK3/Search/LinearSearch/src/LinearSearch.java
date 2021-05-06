public class LinearSearch {
    public static int linearSearch(int[] arr,int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x){
                return i;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        int[] arr = {2,3,4,4,5,6,1,4,5,7};
        int result = linearSearch(arr,4);
        if(result == -1){
            System.out.println("Not found");
        }else
            System.out.println("Element at index: "+result);
    }
}
