package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class n_11000 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] time = new int[N][2];

        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            time[i][0] = Integer.parseInt(st.nextToken());    // 시작시간
            time[i][1] = Integer.parseInt(st.nextToken());    // 종료시간
        }

        Arrays.sort(time, (a, b) ->{
            if(a[0]>b[0]){
                return 1;
            }
            else if(a[0]==b[0]){
                return a[1]-b[1];
            }
            else{
                return -1;
            }
        });

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(time[0][1]);
        for(int i=1; i<N; i++){
            if(queue.peek() <=time[i][0]){
                queue.poll();
            }
            queue.add(time[i][1]);
        }
        System.out.println(queue.size() );
    }

}
