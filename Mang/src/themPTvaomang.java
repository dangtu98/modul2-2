import java.util.Arrays;
import java.util.Scanner;

public class themPTvaomang {
    public static void main(String[] args) {
         int [] array = new int[20];
         int index;
         int number;
         int n = 10;
         Scanner scanner = new Scanner(System.in);

         for (int i = 0 ; i < n ; i++){
             array[i] = i + 1;
         }
        System.out.print("mảng ban đầu là :"+ Arrays.toString(array));


        System.out.println();
        System.out.print("nhập số cần thêm vào là : ");
        number = scanner.nextInt();
        System.out.print("thêm chỉ số muốn chèn vào mảng là :");
        index = scanner.nextInt();

        for (int i = n ; i > index ; i--){
            array[i] = array[i - 1];
        }
        array[index] = number;
        System.out.println("mảng sau khi chèn là :");
        for (int i = 0 ; i < array.length ; i++){
            System.out.print(array[i] + "\t");
        }
    }


}
