package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n_15904 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr = br.readLine();
        char[] UCPC = {'U', 'C', 'P', 'C'};
        int count = 0;
        for(int i = 0; i<arr.length(); i++) {
            if(UCPC[count] == (arr.charAt(i))) {
                count++;
            }
            if(count == 4) {
                System.out.println("I love UCPC");
                return;
            }
        }
        System.out.println("I hate UCPC");
    }
}
