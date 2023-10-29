package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n_1475 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        int[] count = new int[10];

        for(int i=0; i<a.length(); i++){
            int num = Character.getNumericValue(a.charAt(i));
            if (num == 6) {
                count[9]++;
            } else {
                count[num]++;
            }
        }

        int max = 0;

        for (int i = 0; i < 9; i++) {
            max = Math.max(max,count[i]);
        }

        int nine = count[9]/2;

        if (count[9]%2==1) nine++;

        max = Math.max(max,nine);
        System.out.print(max);

    }
}
