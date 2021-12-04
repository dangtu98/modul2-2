import java.util.Scanner;

public class BThienthi20songuyento {
    public static void main(String[] args) {
        int number;
        int N = 2;
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số lượng số nguyên tố cần in ra : ");
        number = scanner.nextInt();


        for (int i = 0; i <= number;) {
            for (int j = 2; j <= Math.sqrt(N); j++) {
                if (N % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(N);
                    i++;
            }
            check = true;
            N++;

        }
    }
}
