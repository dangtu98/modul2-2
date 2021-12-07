import java.util.Scanner;

public class btTimGTNN {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập Size cho mảng");
        size = scanner.nextInt();
        int [] array = new int [size];
        System.out.println("nhập phần tử cho mảng");
        for (int i = 0 ; i < array.length ; i++){
            System.out.print(i + ":");
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        for (int i = 0 ; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("giá trị nhỏ nhất trong mảng là :");
        System.out.println(min);
    }
}
