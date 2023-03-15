package Array;

public class Shorted1 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,6,5};

        int temp=arr[0];
        boolean ans =false;
        for(int i=1;i< arr.length;i++){
            if(temp<arr[i]){
                temp=arr[i];
                ans =true;
            }else {
                ans = false;
                break;
            }
        }
        System.out.println(ans);
    }
}
