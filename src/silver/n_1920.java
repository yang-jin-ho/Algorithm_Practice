package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class n_1920 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String[] aList = br.readLine().split(" ");
        int b = Integer.parseInt(br.readLine());
        String[] bList = br.readLine().split(" ");

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < a; i++) {
            set.add(aList[i]);
        }

        for (int i = 0; i < b; i++) {
            if (set.contains(bList[i])) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
