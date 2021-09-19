package if문;
import java.util.Scanner;

public class 알람시계 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        if(h == 0){
            h = 24;
        }

        int time = h * 60 + m - 45;

        h = time / 60;
        m = time - h * 60;

        if(h == 24){
            h = 0;
        }

        System.out.printf("%d %d", h, m);

        sc.close();
    }
}
