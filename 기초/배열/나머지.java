package 배열;
import java.io.*;
import java.util.HashSet;

public class 나머지 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> hs = new HashSet<Integer>();

        for(int i=0; i<10; i++){
            hs.add(Integer.parseInt(br.readLine()) % 42);
        }
        br.close();

        System.out.println(hs.size());
    }
}
