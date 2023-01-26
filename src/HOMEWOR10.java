import java.util.Scanner;

public class HOMEWOR10 {
    public static void main(String[] args) {
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
