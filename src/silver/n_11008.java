package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n_11008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] result = new int[a];
        for(int i =0; i<a; i++) {
            String[] NM = br.readLine().split(" ");
            String N = NM[0];
            String M = NM[1];
            int length = N.replaceAll(M, " ").length();
            result[i] = length;
        }
        for (Integer last : result) {
            System.out.println(last);
        }
}
}
