package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class n_20291 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String[] arr = new String[a];
        for(int i=0; i<a; i++){
            String[] cut = br.readLine().split("\\.");
            arr[i] = cut[1];
        }
        TreeMap<String, Integer> count = new TreeMap<>();

        for(String element : arr){
            if(count.containsKey(element)){
                count.put(element, count.get(element)+1 );
            }
            else{
                count.put(element,1);
            }
        }
        for(Map.Entry<String,Integer> result : count.entrySet()){
            System.out.println(result.getKey() + " " + result.getValue());
        }

    }
}
