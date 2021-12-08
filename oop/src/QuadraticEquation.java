import java.sql.SQLOutput;
import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    QuadraticEquation(double a , double b , double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDelta(){
        return Math.pow(this.b,2) - 4 * this.a * this.c;
    }

    public double getRoot1(){
        return (-this.b + Math.sqrt(getDelta())) / (2 * this.a);
    }
    public double getRoot2(){
        return (-this.b - Math.sqrt(getDelta())) / (2 * this.a);
    }
}

 class giaiPT{
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("nhập number1 ");
         double number1 = scanner.nextDouble();
         System.out.println("nhập number2 ");
         double number2 = scanner.nextDouble();
         System.out.println("nhập number3 ");
         double number3 = scanner.nextDouble();

         QuadraticEquation giaiPTbac2 = new QuadraticEquation(number1,number2,number3);
         if (giaiPTbac2.getDelta() > 0){
             System.out.println("phương trình có 2 nghiệm ");
             System.out.println("nghiệm 1 là" + giaiPTbac2.getRoot1());
             System.out.println("nghiệm 2 là" + giaiPTbac2.getRoot2());
         }else if (giaiPTbac2.getDelta() == 0){
             System.out.println("phương trình có 1 nghiệm duy nhất");
             System.out.println("nghiệm duy nhất là" + giaiPTbac2.getRoot2());
         }else {
             System.out.println("phương trình vô nghiem");
         }

     }
}
