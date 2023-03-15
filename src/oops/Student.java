package oops;

public class Student {
    String name ;
    int age;
    int rollNo;
    String collName;



    Student(String name,int age,int rollNo,String collName){
        this.name=name;
        this.age=age;
        this.rollNo=rollNo;
        this.collName=collName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNo=" + rollNo +
                ", collName='" + collName + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student one = new Student("akash",22,70,"sort");

        System.out.println(one);
    }
}
