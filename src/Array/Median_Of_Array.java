package Array;

public class Median_Of_Array {


    public static void main(String[] args) {

        int []arr={1,2,3,4,5,3};

        int fi = (arr.length-1)/2;
        int mid=0;
        for (int i=0;i< arr.length;i++){
            mid=arr[fi];
        }
        System.out.println(mid);

    }
}
