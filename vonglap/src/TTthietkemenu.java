import java.util.Scanner;

public class TTthietkemenu {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("menu");
            System.out.println("1. hinh tam giac");
            System.out.println("2. hinh vuong");
            System.out.println("3. hinh chu nhat");
            System.out.println("0. Exit");
            System.out.println("enter choice : ");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    System.out.println("hinh tam giac");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case  2:
                    System.out.println("hinh vuong");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("hinh chu nhat");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case  0:
                    System.exit(0);
                default:
                    System.out.println("no choice");
            }

        }
    }
}
