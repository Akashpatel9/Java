package Array;

import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //75- Find the smallest element and print its index too.
        //      {2, 96, 69, 77, 145, 20} = Min element = 2 found at 0 index

        System.out.println("Enter size of array");
        int n= sc.nextInt();
        int []arr= new int[n];

        for (int i=0;i<arr.length;i++){
            System.out.println("Enter "+(i+1)+" element of array");
            arr[i]= sc.nextInt();
        }
        int min=arr[0];
        int index = 0;

        for (int i=0;i<n;i++) {
            if (min > arr[i]) {
                min=arr[i];
                    index=i;
            }
        }System.out.println("Max element = "+min+" found at "+index+" index");



    }
}
