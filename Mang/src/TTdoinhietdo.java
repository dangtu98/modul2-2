
import java.util.Scanner;

public class TTdoinhietdo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double DoC;
        double DoF;
        int choice;


        do {
            System.out.println("Menu");
            System.out.println("1. Chuyển từ Độ F sang độ C");
            System.out.println("2. Chuyển từ Độ C sang độ F");
            System.out.println("0. exit");
            System.out.println("enter Choice:");
            choice = scanner.nextInt();

            switch (choice){
                case 1 :
                    System.out.println("nhập độ F ");
                    DoF = scanner.nextDouble();
                    System.out.println("Chuyển từ Dộ F sang Độ C là "  + doFchuyendoC(DoF) );
                    break;
                case 2 :
                    System.out.println("nhập độ C");
                    DoC = scanner.nextDouble();
                    System.out.println("chuyển từ C sang F là " + doCchuyendoF(DoC) );
                    break;
                case 0 :
                    System.exit(0);
            }
        }while (choice != 0 );
    }

    public static double doCchuyendoF(double DoC) {
             double DoF = (9.0 / 5) * DoC + 32;
             return  DoF;
    }
    public static double doFchuyendoC(double DoF){
        double DoC =  (5.0 / 9) * (DoF - 32);
        return  DoC;
    }
}
