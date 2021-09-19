package 배열;
import java.io.*;
import java.util.StringTokenizer;

public class min_max {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();

        int min = Integer.parseInt(st.nextToken());
        int max = min;

        for(int i=1; i<n; i++){
            int num = Integer.parseInt(st.nextToken());

            if(num < min){
                min = num;
            }
            if(num > max){
                max = num;
            }
        }

        bw.write(min+" "+max+"\n");
        bw.flush();
        bw.close();
    }    
}
