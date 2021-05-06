import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Scanner;
public class IntergerList{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i< n; i++){
            a[i] = sc.nextInt();

        }
        int k;
        do k = sc.nextInt();
        while(k < 0 || k > n);
        int x = sc.nextInt();
        int kt = n -1;
        int[] temp = new int[n+1];
        for( int i = temp.length-1;i >=0;i--){
            if(i != k-1){
                temp[i] =a[kt--];


            }else{
                temp[i]= x;
            }
        }


        System.out.println(Arrays.toString(temp));

    }

}
