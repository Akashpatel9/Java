package Array;

import java.util.Arrays;

public class Array_Reverse_Without_space {
    public static void main(String[] args) {

        //86- Array Reverse Without Using Extra space

        int []arr={1,2,3,4,5};

        int temp=0;

        for(int i=0;i< arr.length/2;i++){

            temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}
