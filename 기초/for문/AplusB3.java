package for문;
import java.util.Scanner;

public class AplusB3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int a, b;

        for(int i=0; i<t; i++){
            a = sc.nextInt();
            b = sc.nextInt();

            System.out.println(a+b);
        }

        sc.close();
    }
}
