import java.util.Scanner;

public class urok10 {
    public static void main(String[] args) {

//        method(1, 3, 4, 5, 6, 7, 111, 222, 333, 9, 99);
//    }
//
//    static void method(int...varargs) {
//        metho(1, 1, 1, 1, 2, 3, 4, 5, 6);


//    }
//
//    static void metho(int... name) {
//        int sum = 0;
//        for (int i = 0; i < name.length; i++){
//            sum =sum+name[i];
//        }
//        System.out.println(sum);
        //TODO МЕТОД МЕНЕН КУН ЧЫГАРУ
//        System.out.println(justMethon(5));
//
//    }
//
//    public static String justMethon(int day) {
//        switch (day) {
//            case 1 -> {
//                return "";
//            }
//            case 2 -> {
//                return "K";
//            }
//            case 3 -> {
//                return "w";
//            }
//            case 4 -> {
//                return "y";
//            }
//            case 5 -> {
//                return "t";
        Scanner in = new Scanner(System.in);
        System.out.println("биринчи сан жазыныз");
        System.out.println(array(in.nextInt(),1, 2, 3, 4, 5, 6));
    }
        static boolean array(int a, int...array){
             for (int i = 0; i <array.length;i++){
                 if (a==array[i]){
                     return true;
                 }
        }
             return false;

    }
}




