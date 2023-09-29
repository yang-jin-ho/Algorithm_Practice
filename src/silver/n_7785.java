package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class n_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        HashMap<String, String> map = new HashMap<>();
        for(int i=0; i<a; i++){
            String b = br.readLine();
            String[] tokens = b.split(" ");
            map.put(tokens[0],tokens[1]);
        }

        ArrayList<String> keysWithTargetValue = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (Objects.equals(entry.getValue(), "enter")) {
                keysWithTargetValue.add(entry.getKey());
            }
        }

        // 배열 역순으로 정렬
        keysWithTargetValue.sort(Collections.reverseOrder());

        // 역순으로 정렬된 배열에서 Key 출력
        for (String key : keysWithTargetValue) {
            System.out.println(key);
        }
    }
}
