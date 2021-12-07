import java.util.Scanner;

public class TTdaonguoctrongmang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhập vào size mảng : ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("size mảng nhỏ hơn 20");
            }
        } while (size > 20);

//        nhập các giá trị vào mảng

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("giá trị phần tử trong mảng thứ " + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }

//        hiển thị mảng ban đầu

        System.out.printf("%-20s%s", "mảng ban đầu là", "");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

//        đảo ngược mảng

        for (int i = 0 ; i < array.length / 2 ; i++){
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }

//        hiển thị mảng đã đảo

        System.out.printf("\n%-20s%s" , "mảng đảo ngược là:" , "");
        for (int i = 0 ; i < array.length ; i++){
            System.out.print(array[i] + "\t");
        }
    }
}
