package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Objects;

public class n_9536 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String input = "";
        HashMap<String, String> animal = new HashMap<>();

        for (int i = 0; i < a; i++) {
            input = br.readLine();

            String[] words = input.split(" ");
            for (int j = 0; j < 100; j++) {
                String[] check = br.readLine().split(" ");
                if (Objects.equals(check[1], "does")) break;
                else {
                    animal.put(check[0], check[2]);
                }
            }
            for (int j = 0; j < words.length; j++) {
                if (!animal.containsValue(words[j])) {
                    System.out.print(words[j] + " ");
                }
            }
        }
    }
}
