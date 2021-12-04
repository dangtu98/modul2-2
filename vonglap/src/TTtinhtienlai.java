import java.util.Scanner;

public class TTtinhtienlai {
    public static void main(String[] args) {
        double tien;
        int thang;
        double lai;
        double tonglaixuat = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số tiền ");
        tien = scanner.nextDouble();

        System.out.println("nhập vào số tháng");
        thang = scanner.nextInt();

        System.out.println("nhập vào lãi xuất");
        lai  = scanner.nextDouble();

        for ( int i = 0 ; i < thang ; i++ ){
            tonglaixuat += tien * (lai/100)/12 * thang;
        }
        System.out.println("tổng số tiền lãi " + tonglaixuat);
    }
}
