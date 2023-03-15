package Shorting_Algo;

import java.util.Arrays;

public class BubbeLe_Shoryt {
    public static void main(String[] args) {


        int []arr={9,1,2,6,3,3,1};

        int temp=0;

        for(int j=0;j< arr.length-1;j++) {
            for (int i = 0; i < arr.length-1-j; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }System.out.println(Arrays.toString(arr));


    }
}
