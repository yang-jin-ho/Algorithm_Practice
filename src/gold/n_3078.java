package gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class n_3078 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Queue<Integer>[] q = new LinkedList[21];

        for (int i = 0; i < 21; i++) {
            q[i] = new LinkedList<Integer>();
        }

        long count = 0;

        /*
        4 2
        IVA
        IVO
        ANA
        TOM
        */
        for(int i=0;i<N;i++) {
            String line = br.readLine();
            int sl = line.length();
                //3
            if(q[sl].isEmpty()) {
            //q[3] 0
                q[sl].add(i);

            }
            else {

                while(i- q[sl].peek() > M){
                    q[sl].poll();

                    if(q[sl].isEmpty()){
                        break;
                    }

                }

                count += q[sl].size();
                q[sl].add(i);
            }
        }
        System.out.println(count);
    }
}
