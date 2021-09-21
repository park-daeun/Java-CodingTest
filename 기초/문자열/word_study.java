package 문자열;
import java.io.*;
import java.util.HashMap;

public class word_study {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        s = s.toUpperCase();
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        for(int i=0; i<s.length(); i++){
            String c = s.substring(i, i+1);
            
            if(hm.containsKey(c)){
                int n = hm.get(c);
                hm.put(c, n+1);
            }
            else{
                hm.put(c, 1);
            }
        }

        int max = 0;
        String max_s = "?";
        for(String key: hm.keySet()){
            int val = hm.get(key);

            if(val == max){
                max_s = "?";
            }
            else if(val > max){
                max = val;
                max_s = key;
            }
        }

        System.out.println(max_s);
    }
}