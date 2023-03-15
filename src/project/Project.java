package project;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Project {
    public static void main(String[] args)throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your folder name");
        String folderName = sc.nextLine();

        String finalPath = System.getProperty("user.home") + "\\Desktop\\" + folderName;
        File f = new File(finalPath);
        f.mkdir();



        File html = new File(finalPath+"\\index.html");
        File css = new File(finalPath+"\\style.css");
        File js = new File(finalPath+"\\script.js");

        html.createNewFile();
        css.createNewFile();
        js.createNewFile();

        FileWriter fw = new FileWriter(html);
        fw.write("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Document</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    \n" +
                "</body>\n" +
                "</html>");
        fw.close();

        fw = new FileWriter(css);
        fw.write("* {\n" +
                "    padding: 0;\n" +
                "    margin: 0;\n" +
                "    box-sizing: border-box;\n" +
                "}\n" +
                "\n" +
                "html,\n" +
                "body {\n" +
                "    height: 100%;\n" +
                "    width: 100%;\n" +
                "}");
        fw.close();




    }
}
