package Shorting_Algo;

import java.util.Arrays;

public class Selection_Short {
    public static void main(String[] args) {

        int []arr ={3,4,7,1,9,4};

        for(int i=0;i<arr.length-1;i++){
            int curr = i;
            for(int j=i+1;j< arr.length;j++){
                 if(arr[curr]>arr[j]){
                    curr = j;
                 }
            }
            int tem = arr[curr];
            arr[curr]= arr[i];
            arr[i]=tem;
        }
        System.out.println(Arrays.toString(arr));


    }
}
