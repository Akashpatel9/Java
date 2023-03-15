package String;

public class VovAddCon {
    public static void main(String[] args) {

        String  c = "ORIGINAL";

        String vove = "";
        String con = "";

        for (int i=0;i<c.length();i++){
            switch (c.charAt(i)){
                case 'a','e','i','o','u','A','E','I','O','U' -> vove+=c.charAt(i);
                default -> con+=c.charAt(i);
            }
        }
        String ans = vove+con;
        System.out.println(ans);
    }
}
