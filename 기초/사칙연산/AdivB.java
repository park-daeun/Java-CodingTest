package 사칙연산;
import java.util.Scanner;

public class AdivB {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(a/b);

        sc.close();
    }
}
