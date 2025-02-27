package OPPS;
class Student{
    String name;
    int rollno;
    Student(String name){
        //System.out.println();
        this.name=name;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student s1=new Student("Shirshak");
        System.out.println(s1.name);
    }
}
