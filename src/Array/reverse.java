package Array;

import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {

        int []arr={1,2,3,4,5};

        int [] temp=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            temp[i]=arr[arr.length-i-1];
        }
        arr=temp;
        System.out.println(Arrays.toString(arr));
    }
}
