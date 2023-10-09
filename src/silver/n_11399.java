package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n_11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] A = new int[a];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < a; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        int result = 0;
        int time = 0;
        for (int i=0; i<a; i++){
        int add = A[i];
        result = result + add;
        time = time + result;
        }
        System.out.println(time);
    }
}
