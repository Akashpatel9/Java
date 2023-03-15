package String;

import java.sql.Array;
import java.util.Arrays;

public class Short {
    public static void main(String[] args) {

        String s ="gdsav dfsv dvsw";

        String []wo = s.split(" ");

        String temp ="";
        for (String a : wo){
             String tem="";
             tem+= a;
            for (int i=0;i<tem.length();i++){
                int con = tem.charAt(i);
                for (int j=0;j<tem.length()-1-i;j++){
                    if (tem.charAt(j)>tem.charAt(j+1)){

                    }
                }
            }
        }


    }
}
