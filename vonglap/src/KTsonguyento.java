import java.util.Scanner;

public class KTsonguyento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số một số nguyên");
        int number = scanner.nextInt();
        if ( number < 2){
            System.out.println("không phải là số nguyên tố");
        }else {
            boolean check = true;
            for ( int i = 2 ; i <= Math.sqrt(number) ; i++){
                if (number % i == 0){
                    check = false;
                    break;
               }
            }
            if (check){
                System.out.println("là số nguyên tố "  + number);
            }else {
                System.out.println("không phải số nguyên tố  " + number);
            }
        }
    }
}
