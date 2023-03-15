package Whie_Loop;

public class print_PrimeNumbers {
    public static void main(String[] args) {
        int n=100;
        int c=1;


        while (c!=n){
            int co=0;
            for (int i=1;i<=c;i++){
                if(c%i==0){
                    co++;
                }
            }
            if (co==2){
                System.out.println(c);
            }
            c++;
        }
    }
}
