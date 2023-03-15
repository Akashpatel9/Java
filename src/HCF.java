class HCF{
    public static void main(String[] args) {
        int a  = 2,b=4;

        for (int i = Math.min(a,b); i >=1 ; i--) {
            if(a%i==0 && b%i==0){
                System.out.println(i);
                break;
            }
        }
    }
}