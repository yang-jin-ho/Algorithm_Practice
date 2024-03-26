package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class n_19638 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }

        int cnt = 0;

        for(int i=0; i<t; i++){
            if(pq.peek()<h || pq.peek()==1)
                break;
            else
                pq.add(pq.poll()/2);
            cnt++;
        }
        if(pq.peek()>=h)
            System.out.println("NO\n" + pq.peek());
        else System.out.println("YES\n" + cnt);
    }
}