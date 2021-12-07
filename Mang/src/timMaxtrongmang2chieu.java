import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class timMaxtrongmang2chieu {
    public static void main(String[] args) {
        int n , m ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số dòng cho ma trận ");
        m = scanner.nextInt();
        System.out.println("nhập số cột cho ma trận ");
        n= scanner.nextInt();

        int [][] arr = new int [m][n];

        System.out.println("nhập phần tử cho ma trận");
        for (int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print("arr[" + i +"]["+ j +"]" + "=");
                arr[i][j] = scanner.nextInt();
            }
        }
        int max = arr[0][0];
        for (int i = 0 ; i < m ; i++){
            for (int j = 0 ; j < n ; j++){
                 if (max < arr[i][j]){
                     max = arr[i][j];
                 }
            }
        }
        System.out.println("phần tử lớn nhất trong ma trận là " + max);
    }
}
