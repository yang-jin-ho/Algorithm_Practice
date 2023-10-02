package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class n_16435 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);
        String[] fruit = br.readLine().split(" ");

        int[] numbers = new int[fruit.length];
        for (int i = 0; i < fruit.length; i++) {
            numbers[i] = Integer.parseInt(fruit[i]);
        }
        Arrays.sort(numbers);

        for(int j=0; j<N; j++){
            if(M>=numbers[j]){
                M++;
            }
        }
        System.out.println(M);
    }
}
