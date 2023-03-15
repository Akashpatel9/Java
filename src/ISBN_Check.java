import java.util.Scanner;

public class ISBN_Check {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ISBN Number");
        int n = sc.nextInt();

        int count =0;

        int []arr=new int[10];

        while (n>0&&count<11) {
            int rem = n % 10;
            arr[arr.length - 1 - count] = rem;
            count++;
            n = n / 10;
        }

        int sum =0;

        if(count==10){
            System.out.print("ISBN ");
            for (int i = 0;i< arr.length;i++){
                System.out.print(arr[i]);
                sum +=arr[arr.length-1-i]*count;
                count--;
            }
            if (sum%11==0){
                System.out.println(" = Legal ISBN");
            }else {
                System.out.println(" = Illegal ISBN");
            }
        }
        else {
            System.out.println("Illegal ISBN");
        }
    }
}
