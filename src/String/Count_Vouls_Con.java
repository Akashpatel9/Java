package String;

public class Count_Vouls_Con {
    public static void main(String[] args) {
        String c = "akash";
        int v =0;
        int co =0;
        for (int i=0;i<c.length();i++){
            switch (c.charAt(i)){
                case 'a','e','i','o','u' -> v++;
                default -> co++;
            }
        }
        System.out.println("vowel = "+v);
        System.out.println("consent= "+co);


    }
}
