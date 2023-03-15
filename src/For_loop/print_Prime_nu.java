package For_loop;

public class print_Prime_nu {

    public static boolean prime(int n){
        boolean ans=true;
        for(int j=2;j<n;j++) {
            if (n % j == 0) {
                ans = false;
                break;
            }
        }
        return ans;
    }
    public static void pr(int a){
        for(int i=2;i<=a;i++){
            if(prime(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {

        int a =100;
        pr(a);

    }
}
