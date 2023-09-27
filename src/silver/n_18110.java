package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class n_18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int cut = (int) Math.round(a*0.15);
        double sum = 0;
        int[] array = new int[a];
        for(int i=0; i<a; i++){
            array[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(array);

        for (int i = cut; i < a-cut; i++) {
            sum += array[i];
        }

        int result = (int) Math.round(sum / (a -2*cut));
        System.out.println(result);
    }
}
