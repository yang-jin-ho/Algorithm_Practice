package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n_9507 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        long[] result = new long[68];
        long[] last = new long[a];
        result[0] = 1;
        result[1] = 1;
        result[2] = 2;
        result[3] = 4;
        for(int i=4; i<68; i++){
            result[i] = result[i-1] + result[i-2] + result[i-3] + result[i-4];
        }

        for(int j=0; j<a; j++){
           last[j]=result[Integer.parseInt(br.readLine())];
        }

        for (long i : last) {
            System.out.println(i);
        }
    }
}
