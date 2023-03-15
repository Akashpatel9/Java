package Array;

import java.util.Arrays;

public class Array_Right_Rotation {
    public static void main(String[] args) {

        //Right

        int []arr = {1,2,3,4,5};

        int tem = arr[arr.length-1];
        for(int i= arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }arr[0]=tem;
        System.out.println(Arrays.toString(arr));

    }
}
