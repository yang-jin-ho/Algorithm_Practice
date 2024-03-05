package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class n_2002 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Queue<String> in = new LinkedList<>();

        for(int i=0; i<N; i++){
            in.add(br.readLine());
        }

        Queue<String> out = new LinkedList<>();

        for(int i=0; i<N; i++){
            out.add(br.readLine());
        }

        int count =0;

        while (!out.isEmpty()){
            String first = out.poll();
            if(!in.peek().equals(first)){
                count++;
                in.remove(first);
            }
            else in.poll();
        }

        System.out.println(count);

    }
}
