package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class n_1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NM = br.readLine().split(" ");
        String[] Alist = br.readLine().split(" ");
        String[] Blist = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);
        HashSet<Integer> A = new HashSet<>();
        HashSet<Integer> B = new HashSet<>();
        HashSet<Integer> C = new HashSet<>();
        for(int i=0; i<N; i++){
            A.add(Integer.parseInt(Alist[i]));
        }

        for(int j=0; j<M; j++){
            B.add(Integer.parseInt(Blist[j]));
        }

        C.addAll(A);
        C.addAll(B);

        System.out.println((C.size() - A.size()) + (C.size() -B.size()));



    }
}
