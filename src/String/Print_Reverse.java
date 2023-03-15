package String;

class test{
    public void reverse(String c){
        for (int i=c.length()-1;i>=0;i--){
            System.out.print(c.charAt(i));
        }
    }

}

public class Print_Reverse {
    public static void main(String[] args) {

        test a = new test();
        a.reverse("akash");
    }
}
