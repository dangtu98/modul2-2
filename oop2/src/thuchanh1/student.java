package thuchanh1;

public class student {
    private int rollno;
    private String name;
    private static String college = "DHGTVT";

    student(int r , String n){
        rollno = r;
        name = n ;
    }

    static void  change(){
        college = "codegym";
    }

    void display(){
        System.out.println(rollno + "" + name + "" + college);
    }
}
