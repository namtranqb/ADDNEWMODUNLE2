public class ConcatArray {
    public static void main(String[] args) {
        int[] arrA = creatArray(10);
        int[] arrB = creatArray(8);
        System.out.println("Array A:");
        display(arrA);
        System.out.println("Array B:");
        display(arrB);
        int[] arrC = conCat(arrA,arrB);
        System.out.println("Array C(Array A + Array B):");
        display(arrC);

    }
    static int[] creatArray(int length){
        int[] array = new int[length];
        for(int i=0;i<length;i++){
            array[i] =(int) Math.round(Math.random()*100);
        }
        return array;
    }
    static int[] conCat(int[] arr1,int[] arr2){
        int[] array = new int[arr1.length+arr2.length];
        int index =0;
        for(int value:arr1){
            array[index++]= value;

        }

        for(int value: arr2){
            array[index++] = value;
        }
        return array;
    }
    static void display(int[] arr){
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
