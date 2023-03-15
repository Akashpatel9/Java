import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q69- Find the LCM of two numbers

        System.out.println("Enter any 2 numbers a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 1;
        int lcm=0;


        int max = Math.max(a, b);

        for (int i=max;i<=a*b;i=max*count++){
            if(i%a==0 && i%b==0){
                lcm=i;
                break;
            }
        }System.out.println("lcm = "+lcm);


    }
}
