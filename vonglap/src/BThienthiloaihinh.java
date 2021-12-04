import java.util.Scanner;

public class BThienthiloaihinh {
    public static void main(String[] args) {
            int choice;
        Scanner input = new Scanner(System.in);
            while (true){
                System.out.println("menu");
                System.out.println("1. hinh chu nhat");
                System.out.println("2. hinh tam giac vuong");
                System.out.println("3. hinh tam giac vuong nguoc");
                System.out.println("4. exit");
                choice = input.nextInt();

                switch (choice){
                    case 1:
                        for (int i = 1 ; i <= 3 ; i++){
                            for (int j = 1 ; j <= 10 ; j++){
                                System.out.print("*  ");
                            }
                            System.out.println("");
                        }
                        break;
                    case 2:
                        for(int i = 1 ; i <= 10 ; i++){
                            for (int j = 1 ; j < i ; j++){
                                System.out.print("*  ");
                            }
                            System.out.println("");
                        }
                        break;
                    case 3:
                        for (int i = 10 ; i >= 1 ; i-- ){
                            for(int j = 1; j <= i ; j++){
                                System.out.print("*");
                            }
                            System.out.println("");
                        }
                        break;
                    case 4:
                        System.out.println("exit");
                        break;
                    default:
                        System.out.println("no choice");

                }

            }
    }
}
