package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class n_2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=a; i++){
            queue.add(i);
        }
        for(int j=1; j<=a; j++){
            if(queue.size() ==1){
                System.out.println(queue.poll());
                break;
            }
            else{
                int b= queue.poll();
                System.out.println(b);
                int c = queue.poll();
                queue.add(c);
            }
        }
    }
}
