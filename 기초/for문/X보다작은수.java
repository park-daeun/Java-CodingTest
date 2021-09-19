package for문;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class X보다작은수 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer nx = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(nx.nextToken());
        int x = Integer.parseInt(nx.nextToken());

        StringTokenizer A = new StringTokenizer(br.readLine(), " ");
        br.close();

        for(int i=0; i<n; i++){
            int a = Integer.parseInt(A.nextToken());

            if(a < x){
                bw.write(a+" ");
            }
        }

        bw.flush();
        bw.close();
    }
}
