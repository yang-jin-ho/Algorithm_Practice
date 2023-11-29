package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class n_1966 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt((br.readLine()));

        for(int i=0; i<t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            Queue<Integer> queue = new LinkedList<>();
            Queue<Integer> queueIndex = new LinkedList<>();

            st = new StringTokenizer(br.readLine());

            for(int j=0; j<n; j++){
                queue.offer(Integer.parseInt(st.nextToken()));
                queueIndex.offer(j);
            }

            int count = 1;

            while(!queue.isEmpty()){
                int max = Collections.max(queue);
                int current = queue.poll();
                int currentIndex = queueIndex.poll();

                if(current == max){
                    if(currentIndex == m) {
                        sb.append(count).append("\n");
                        break;
                    }
                    count++;
                }
                else{
                    queue.offer(current);
                    queueIndex.offer(currentIndex);
                }
            }

        }
        System.out.println(sb);

    }

}


