package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class n_10546 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0; i<a; i++){
            String check = br.readLine();
            if(map.get(check)==null) {
                map.put(check,1);
            }
            else{
                map.put(check, map.get(check)+1);
            }
        }
        for(int j=0; j<a-1; j++){
            String check = br.readLine();
            map.put(check,map.get(check) -1);
        }

        for(String result : map.keySet()){
            if(map.get(result) !=0){
                System.out.println(result);
                break;
            }
        }
    }
}
