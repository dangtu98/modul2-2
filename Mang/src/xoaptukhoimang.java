import java.util.Arrays;
import java.util.Scanner;

public class xoaptukhoimang {
    public static void main(String[] args) {
        int [] arr = new int[10];
        int n = 5;
        int index;
        Scanner scanner = new Scanner(System.in);
        System.out.println("mảng ban đầu là :");
        for (int i = 0 ; i < n ; i++){
            arr[i] = i + 1;
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        System.out.print("nhập vào vị trí cần xóa ");
        index = scanner.nextInt();

        for (int i = index ; i < arr.length - 1 ; i++){
            arr[i] = arr[ i + 1 ];
        }

        System.out.println("mảng sau khi xóa là : ");
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}

