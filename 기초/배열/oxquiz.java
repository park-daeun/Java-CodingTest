package 배열;
import java.io.*;

public class oxquiz {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            String[] str = br.readLine().split("");

            int j = 0;
            int sum = 0;
            for(String s: str){
                if(s.equals("O")){
                    j++;
                }
                if(s.equals("X")){
                    j = 0;
                }
                sum += j;
            }
            bw.write(sum + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}