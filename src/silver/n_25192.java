package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class n_25192 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        HashSet<String> result = new HashSet<>();
        for (int i = 0; i < n; i++) {
           String chater = br.readLine();

           if(chater.equals("ENTER")) {
               count = count + result.size();
               result = new HashSet<>();
               continue;
           }

           else if(!result.contains(chater)){
                result.add(chater);
               //count++;
           }

        }
        System.out.println(count+ result.size());
    }
}
