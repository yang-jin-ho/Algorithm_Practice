package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n_1748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int result = 0;
        int cut = 10;
        int base = 1;

        for (int i = 1; i <= a; i++) {
            if (i % cut == 0) {
                base++;
                cut = cut * 10;
            }
            result = result + base;
        }
        System.out.println(result);
    }
}
