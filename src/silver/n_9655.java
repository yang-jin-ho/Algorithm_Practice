package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n_9655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        boolean[] winner = new boolean[1001];
        winner[1]= true;
        winner[2]=false;
        winner[3]=true;
        for(int i=4; i<= 1000; i++){
            winner[i] = !(winner[i-1] || winner[i-3]);
        }
        String result = winner[a] ? "SK" : "CY";
        System.out.println(result);
    }
}
