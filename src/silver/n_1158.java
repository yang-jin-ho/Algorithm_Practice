package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class n_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] MN = br.readLine().split(" ");
        int a = Integer.parseInt(MN[0]);
        int b = Integer.parseInt(MN[1]);
        Queue<Integer> queue = new LinkedList<>();
        Integer[] result = new Integer[a];
        for(int i=1; i<=a; i++){
            queue.add(i);
        }
        for(int j=0; j<a; j++){
            for(int k=0; k<b-1; k++){
                int cut = queue.poll();
                queue.add(cut);
            }
            result[j] = queue.poll();

        }
        System.out.print("<");
        for (int l = 0; l < result.length; l++) {
            System.out.print(result[l]);
            if (l < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(">");

    }
}
