package String;

public class Frequency_Of_EachCharacter {
    public static void main(String[] args) {
        String  n = "dgsyuefbfyuewfwefkm";

        int [] arr = new int[128];

        for (int i=0;i<n.length();i++){
            arr[n.charAt(i)]++;
        }

        for (int i =0;i< arr.length;i++) {
            if (arr[i] > 0) {
                System.out.println((char) i+" = "+arr[i]);
            }
        }
    }
}
