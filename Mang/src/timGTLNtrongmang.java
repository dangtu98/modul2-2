import java.util.Scanner;

public class timGTLNtrongmang {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhập size của mảng ");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("size không lớn hơn 20");
            }
        }while (size > 20);

        array = new int[size];
        for (int i = 0 ; i < array.length ; i++){
            System.out.println("nhập vào giá trị tài sản của tỷ phú  " + (i +1) + "");
            array[i] = scanner.nextInt();
        }

        System.out.println("property : ");
        for (int i = 0 ; i < array.length ; i ++){
            System.out.println(array[i] + "\t");
        }

        int max = array[0];
        int index = 0 ;
        for (int i = 0 ; i < array.length ; i++){
            if (array[i] > max){
                max = array[i];
                index = i + 1;
            }
        }
        System.out.println("tài sản lớn nhất của tỷ phú là  " + max + " ở vị trí : " + index );
    }
}
