package Shorting_Algo;

import java.util.Arrays;

public class Counting_Short {
    public static void main(String[] args) {

        int [] arr = {4,2,7,1,5,3,2,1};

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max= arr[i];
            }
        }
        int []fre = new int[max+1];

        for (int i = 0; i < arr.length; i++) {
            fre[arr[i]]++;
        }

        int indexConut = 0;

        for (int i = 0; i < fre.length; i++) {
            while (fre[i]>0){
                arr[indexConut]=i;
                indexConut++;
                fre[i]--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
