package String;

public class AllWords_Beginning_With_A_Capital {
    public static void main(String[] args) {
        String sen = "Akash How Are You";

        boolean ans = false;
        String []arr= sen.split(" ");

        for (String a : arr){
            String tem = a;
            if(tem.charAt(0)>='A'&&tem.charAt(0)<='Z'){
                ans = true;
            }else {
                break;
            }
        }
        System.out.println(ans);
    }
}
