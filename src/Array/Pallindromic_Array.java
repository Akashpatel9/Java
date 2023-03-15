package Array;

public class Pallindromic_Array {
    public static void main(String[] args) {

        //85- Pallindromic array - Write a program to check if elements of an array are same or not it read from front or back
        //      Example : arr= [2,3,15,15,3,2]85- Pallindromic array - Write a program to check if elements of an array are same or not it read from front or back
        //      Example : arr= [2,3,15,15,3,2]


        int []arr={1,2,3,2,4};
        boolean ans =false;


        for(int i=0;i<arr.length/2;i++){
            if(arr[i]==arr[arr.length-1-i]){
                ans=true;
            }else {
                break;
            }
        }if (ans==true){
            System.out.println("Pallindromic array");
        }else {
            System.out.println("not");
        }



    }
}
