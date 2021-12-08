import com.sun.javafx.iio.gif.GIFImageLoaderFactory;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GiaiPTbac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số a :");
        double a = scanner.nextDouble();
        System.out.println("nhập vào số b :");
        double b = scanner.nextDouble();
        System.out.println("nhập vào số c :");
        double c = scanner.nextDouble();

        PhuongTrinh phuongtrinh_bac2 = new PhuongTrinh(a,b,c);


        if ( a == 0){
            if(b == 0){
                if(c == 0){
                    System.out.println("phuong trinh vo so nghiem");
                }else {
                    System.out.println("phuong trinh vo nghien");
                }
            }else {
                System.out.println("phuong bac nhat " + phuongtrinh_bac2.getRoot3());
            }
        }else {
            if (phuongtrinh_bac2.getDelta() > 0){
                System.out.println("phương trình có 2 nghiệm");
                System.out.println("nghiệm 1 là :" + phuongtrinh_bac2.getRoot1());
                System.out.println("nghiệm 2 là "  + phuongtrinh_bac2.getRoot2() );
            }else if(phuongtrinh_bac2.getDelta() == 0 ){
                System.out.println("phương trình có 1 nghiệm kép");
                System.out.println("nghiệm kép là " + phuongtrinh_bac2.getRoot2());
            }else {
                System.out.println("phương không có nghiệm");
            }
        }

    }
}


