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
        int sun = num + nam + mun / 3;
        System.out.println(sun);
        int sum = sun / 2;
        if (
                sum > 3
        )

        {
            System.out.println( "Программа выполнена корректно");

        }
    }
}
