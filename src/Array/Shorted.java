package Array;

import java.util.Scanner;

public class Shorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int []arr={6,54,3,2,1};
        int max=arr[0];
        int M = Math.max(arr[0],arr[arr.length-1]);

        boolean sho = false;

        if(M==arr[0]) {
            for (int i = 1; i < arr.length; i++) {
                if (max >= arr[i]) {
                    max = arr[i];
                    sho = true;
                } else {
                    sho = false;
                    break;
                }
            }
            System.out.println(sho);
        }else {
            for (int i = 1; i < arr.length; i++) {
                if (max <= arr[i]) {
                    max = arr[i];
                    sho = true;
                } else {
                    sho = false;
                    break;
                }
            }
            System.out.println(sho);
        }
    }
}
