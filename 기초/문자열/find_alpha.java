package 문자열;
import java.io.*;

public class find_alpha {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        br.close();

        for(char c = 'a'; c <='z'; c++){
            bw.write(s.indexOf(Character.toString(c))+" ");
        }
        bw.flush();
        bw.close();
    }
}