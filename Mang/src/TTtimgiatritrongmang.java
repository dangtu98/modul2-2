
import java.util.Scanner;

public class TTtimgiatritrongmang {
    public static void main(String[] args) {
        String[] students = {"tu", "trung", "cuong", "huy", "sang"};
        String input_studens;

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên thằng sinh viên :");
        input_studens = scanner.nextLine();


        boolean isExit = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_studens)) {
                System.out.println("thằng sinh viên này là " + input_studens + " o vi tri " + i);
                isExit = true;
                break;
            }
        }
        if (!isExit) {
            System.out.println("không có trong danh sách");
        }

    }

}

