package String;
class pelendromic{
    public void Pel(String c){
        boolean ans = true;
       int a = 0;
       int b = c.length()-1;
       while (b>=a){
           if (c.charAt(a) != c.charAt(b)) {
               ans = false;
               break;
           }
           a++;
           b--;
       }
        if (ans) {
            System.out.println("it is");
        }else {
            System.out.println("not");
        }
    }
}

public class Check_Pallindromic_To_Pointer_Algo {
    public static void main(String[] args) {
        pelendromic a = new pelendromic();
        a.Pel("akaa");
    }
}
