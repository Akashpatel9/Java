package Array;

import java.util.Scanner;

public class Mean_of_ELe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //73- Mean of array elements.

        System.out.println("Enter size of array");
        int n= sc.nextInt();
        int []arr= new int[n];

        for (int i=0;i<arr.length;i++){
            System.out.println("Enter "+(i+1)+" element of array");
            arr[i]= sc.nextInt();
        }
        int mean =0;
        int sum=0;

        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        mean=sum/ arr.length;
        System.out.println("Mean of array elements = "+mean);






    }
}
