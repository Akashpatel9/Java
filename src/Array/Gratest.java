package Array;

import java.util.Scanner;

public class Gratest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //74- Find the greatest element and print its index too.
        //      {2, 96, 69, 77, 145, 20} = Max element = 145 found at 4 index


        System.out.println("Enter size of array");
        int n= sc.nextInt();
        int []arr= new int[n];

        for (int i=0;i<arr.length;i++){
            System.out.println("Enter "+(i)+" element of array");
            arr[i]= sc.nextInt();
        }
        int max =arr[0];
        int maxindex = 0;

        for (int i=1;i<n;i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxindex = i;
            }
        }System.out.println("Max element = "+max+" found at "+maxindex+" index");


    }
}
