package Array;

public class Linear_Search {
    public static void main(String[] args) {


        //87- Linear Search an array - If element found print the index else -1

        int[]arr={1,2,3,4,5};

        int search = 3;
        int index = -1;
        for (int i=0;i< arr.length;i++){
            if(arr[i]==search){
                index=i;
                break;
            }
        }
        System.out.println(index);

    }
}
