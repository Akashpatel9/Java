package String;
public class Seperated_Sentence_And_Split {

    public static String cap(String a){
        if(a.length()<=2) {
            return a.toUpperCase();
        }
        String fir = Character.toString(a.charAt(0)).toUpperCase();
        String mid = a.substring(1,a.length()-1);
        String las = Character.toString(a.charAt(a.length()-1)).toUpperCase();

        return fir+mid+las;
    }

 public static void main(String[] args) {

     String c = "hello bhea kayse ho a";

     String [] arr = c.split(" ");

     String tem ="";
     for (String a : arr){
         tem+=cap(a)+" ";
     }

     System.out.println(tem.trim());

    }
}