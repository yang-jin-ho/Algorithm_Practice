package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class n_11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int a = word.length();
        StringBuilder sb = new StringBuilder(word);
        String[] result = new String[sb.length()];
        for(int i=0; i<a; i++){
            result[i] = sb.toString();
            sb.deleteCharAt(0);
        }
        Arrays.sort(result);

        for(int j=0; j<a; j++){
            System.out.println(result[j]);
        }
    }
}
