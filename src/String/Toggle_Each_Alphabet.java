package String;

public class Toggle_Each_Alphabet {
    public static void main(String[] args) {

        String c = "AkaSH";
        String t = "";
        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) >= 'A' && c.charAt(i) <= 'Z') {
                t += (char) (c.charAt(i) + 32);
            } else if (c.charAt(i) >= 'a' && c.charAt(i) <= 'z') {
                t += (char) (c.charAt(i) - 32);
            }
        }
        System.out.println(t);

    }
}
