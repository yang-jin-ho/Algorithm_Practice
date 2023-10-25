package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class n_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int last = 0;
        for(int i=0; i<a; i++) {
            String[] NM = br.readLine().split(" ");
            if (Objects.equals(NM[0], "push")) {
                last = Integer.parseInt(NM[1]);
                queue.add(Integer.parseInt(NM[1]));
                continue;
            }
            if(Objects.equals(NM[0], "pop")){
                if(queue.isEmpty()) System.out.println(-1);
                else System.out.println(queue.poll());
                continue;
            }
            if(Objects.equals(NM[0], "size")){
                System.out.println(queue.size());
                continue;
            }
            if(Objects.equals(NM[0], "empty")){
                if(queue.isEmpty()) System.out.println(1);
                else System.out.println(0);
                continue;
            }
            if(Objects.equals(NM[0], "front")){
                if(queue.isEmpty()) System.out.println(-1);
                else System.out.println(queue.peek());
                continue;
            }
            if(Objects.equals(NM[0], "back")){
                if(queue.isEmpty()) System.out.println(-1);
                else System.out.println(last);

            }

        }
    }
}
