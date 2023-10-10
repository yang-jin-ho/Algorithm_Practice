package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class n_17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] MN = br.readLine().split(" ");
        int a = Integer.parseInt(MN[0]);
        int b = Integer.parseInt(MN[1]);
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < a; i++) {
            String c = br.readLine();
            String[] tokens = c.split(" ");
            map.put(tokens[0], tokens[1]);
        }
        for(int j=0; j<b; j++){
            String d = br.readLine();
            System.out.println(map.get(d));
        }
    }
}
