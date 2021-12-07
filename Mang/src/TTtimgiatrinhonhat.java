public class TTtimgiatrinhonhat {
    public static void main(String[] args) {
        int [] array = {3,2,1,7,5,4,6};
        int index = gtMin(array);
        System.out.print("giá trị nhỏ nhất là " + array[index]);
    }

    public static int gtMin(int [] arr) {
        int index = 0;
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] < arr[index]){
                index = i;
            }
        }
       return index;
    }
}

//public class TTtimgiatrinhonhat  {
//    public static void main(String[] args) {
//        int [] array = {9,3,6,4,7,8,1};
//        int min = array[0];
//        for (int i = 0 ; i < array.length ; i++){
//            if (array[i] < min){
//                min = array[i];
//            }
//        }
//            System.out.println( "giá trị nhỏ nhất là " + min);
//
//    }
//}