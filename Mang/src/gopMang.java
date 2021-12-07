import java.util.Arrays;
import java.util.Scanner;

public class gopMang {
    public static void main(String[] args) {
        int [] array1 = new int [5];
        int [] array2 = new int [5];
        int Length = array1.length + array2.length;
        int [] array3 = new int [Length];
        int pos = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập phần tử cho mảng 1");

        for (int i = 0 ; i < array1.length; i++){
            System.out.print((i) + "\t");
            array1[i] = scanner.nextInt();
        }

        System.out.println("nhập phần tử cho mảng 2");
        for (int i = 0 ; i < array2.length ; i++){
            System.out.print((i) + "\t");
            array2[i] = scanner.nextInt();
        }

        for (int i = 0 ; i < array1 .length ; i++){
            array3[pos] = array1[i];
            pos++;
        }
        for(int i = 0 ; i < array2.length ; i++){
            array3[pos] = array2[i];
            pos++;
        }
        System.out.println(Arrays.toString(array3));
    }
}
