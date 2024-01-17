package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class n_5567 {
    static boolean[] visited = new boolean[501];
    static int[] limit = new int[501];
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[][] frd = new int[n + 1][n + 1];

        while (m > 0) {
            String[] split = br.readLine().split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);

            frd[a][b] = 1;
            frd[b][a] = 1;
            m--;
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        limit[1] = 0;
        visited[1] = true;
        while (!queue.isEmpty()) {
            int now = queue.remove();

            if(limit[now]<2) {
                int[] nextNodes = frd[now];
                for (int i = 0; i < nextNodes.length; i++) {
                    if (nextNodes[i] == 1 && !visited[i]) {
                        visited[i] = true;
                        limit[i] = limit[now] + 1;
                        result++;

                        queue.add(i);
                    }
                }
            }
        }

        System.out.println(result);
    }

}
