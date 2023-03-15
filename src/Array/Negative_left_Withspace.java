package Array;

import java.util.Arrays;

public class Negative_left_Withspace {
    public static void main(String[] args) {

        int[] arr = {1, -2, 3, -4, 5,-6, 7,-8};
        int []narr=new int[arr.length];

        int start = 0;
        int end = arr.length-1;

        for(int i=0;i< arr.length;i++){
            if(arr[i]<0){
                narr[start]=arr[i];
                start++;
            }else if(arr[i]>0){
                narr[end]=arr[i];
                end--;
            }
        }arr =narr;
        System.out.println(Arrays.toString(arr));

    }
}
