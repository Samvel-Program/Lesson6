import java.util.Scanner;

/**
 * Created by OUT-Akopyan-SR on 16.05.2019.
 */
public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int nam = in.nextInt();
        int mun = in.nextInt();
        int sum = num + nam + mun / 3;
        int summa = sum / 2;
        if (summa > 3) {
            System.out.println("Программа выполнена корректно");

        }
    }
}
