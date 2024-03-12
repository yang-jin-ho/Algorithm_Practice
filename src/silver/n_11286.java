package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class n_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Math.abs(o1) == Math.abs(o2))
                {
                    return Integer.compare(o1, o2);
                } else
                {
                    return Math.abs(o1) - Math.abs(o2);
                }
            }
        });


        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int now = Integer.parseInt(br.readLine());
            if (now == 0) {
                if (!queue.isEmpty()) {
                    sb.append(queue.poll()).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else queue.add(now);
        }

        System.out.println(sb);

    }
}
