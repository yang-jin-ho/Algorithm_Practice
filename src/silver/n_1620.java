package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class n_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        HashMap<String, String> pokemon = new HashMap<>();
        String[] pokemonArray = new String[N + 1];

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            pokemon.put(name, String.valueOf(i));
            pokemonArray[i] = name;
        }

        StringBuilder sb = new StringBuilder();
        for (int j = 1; j <= M; j++) {
            String result = br.readLine();
            if (Character.isDigit(result.charAt(0))) {
                sb.append(pokemonArray[Integer.parseInt(result)]).append("\n");
            } else {
                sb.append(pokemon.get(result)).append("\n");
            }
        }

        System.out.print(sb.toString());
    }

}
