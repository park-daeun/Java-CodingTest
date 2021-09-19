package while문;
import java.io.*;

public class plus_cycle {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();
        br.close();

        int ori_num = Integer.parseInt(num);
        int ans = 0;

        while(true){
            ans++;

            if(num.length() < 2){
                num = "0" + num;
            }

            int sum = Integer.parseInt(num.substring(0, 1)) + Integer.parseInt(num.substring(1, 2));
            if(sum >= 10){
                sum %= 10;
            }

            String new_num = num.substring(1, 2) + Integer.toString(sum);

            if(Integer.parseInt(new_num) == ori_num){
                bw.write(ans + "\n");
                break;
            }

            num = new_num;
        }

        bw.flush();
        bw.close();
    }
}