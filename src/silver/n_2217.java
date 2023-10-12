package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class n_2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = a;
        int[] arr = new int[a];
        for(int i=0; i<a; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        for(int j=0; j<a; j++){
            arr[j] = arr[j] * b;
            b--;
        }
        Arrays.sort(arr);
        System.out.println(arr[a-1]);
    }
}
