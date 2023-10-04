package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class n_27964 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String[] cheese = br.readLine().split(" ");
        Set<String> stringSet = new HashSet<>();
        for(int i=0; i<a; i++){
            if(cheese[i].endsWith("Cheese")) stringSet.add(cheese[i]);
        }
        if(stringSet.size()<4) System.out.println("sad");
        else System.out.println("yummy");

    }
}
