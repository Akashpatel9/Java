package Array;

public class Binary_Search {
    public static void main(String[] args) {

        int []arr={1,2,3,4,5,6};

        int start=0,end= arr.length-1;
        int index = -1;
        int k = 4;

        while (start<=end){
            int mid=(start+end)/2;
            if(k==arr[mid]){
                index=mid;
                break;
            }if(k>arr[mid]){
                start=mid+1;
            }else if(k<arr[mid]){
                end=mid-1;
            }
        }
        System.out.println(index);

    }
}
