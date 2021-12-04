import java.sql.SQLOutput;
import java.util.Scanner;

public class timuocchungsln {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số a : ");
        int a = input.nextInt();
        System.out.println("nhập số b : ");
        int b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0 || a == b){
            System.out.println("không có Ước chung a và b ");
        }else {
            while (a != b){
                if (a > b){
                    a = a - b;
                }else {
                    b = b -a;
                }
            }
            System.out.println("ước chung lớn nhất a và b là :" + a) ;
        }
    }
}
