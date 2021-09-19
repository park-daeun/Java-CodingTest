import java.io.*;

public class repeat {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        
        for(int i=0; i<t; i++){
            String[] arr = br.readLine().split(" ");

            int r = Integer.parseInt(arr[0]);
            String[] s = arr[1].split("");

            for(String a:s){
                bw.write(a.repeat(r));
            }
            
            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}