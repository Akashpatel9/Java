import java.awt.font.TextHitInfo;

public class Student_Data {
        int age ;
        String name ;
        String clg;
    Student_Data(String name ,int age ,String clg){
        this.name = name;
        this.age = age;
        this.clg =clg;
    }

    public void data(int age ,String name , String clg){
        System.out.println(name);
        System.out.println(age);
        System.out.println(clg);
    }

    @Override
    public String toString() {
        return "Student_Data{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", clg='" + clg + '\'' +
                '}';
    }


}
