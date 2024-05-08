package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class n_22233 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();
        for(int i=0; i<n; i++){
            set.add(br.readLine());
        }

        for(int j=0; j<m; j++){
            st = new StringTokenizer(br.readLine(),",");
            while(st.hasMoreTokens()){
                String s = st.nextToken();
                if(set.contains(s))
                    set.remove(s);
            }
            System.out.println(set.size());
        }
    }
}
/*
 해시 - > 해시 함수에 의해 데이터가 해시 코드로 변환되는 방식
 해시 함수 -> 임의의 길이를 갖는 임의의 데이터를 고정된 길이의 데이터(해시 값)로 매핑하는 함수
             데이터를 해시 코드로 변환하여 배열의 인덱스로 사용하는 함수를 의미

 # 해시 충돌? 해시 함수가 서로 다른 입력에 대해 같은 해시 코드를 반환하는 경우, 해시 충돌이 발생
                       같은 해시 코드를 가진 요소들은 같은 버킷(슬롯)에 할당
                       같은 버킷에 할당된 요소들은 연결된 리스트(체이닝) 형태로 저장

 HashMap -> Map 인터페이스의 구현체, Key에 대한 Hash 값을 사용하여 Value를 저장하고 조회
            HashMap은 중복 Key 값을 허용하지 않지만, 중복 Value 값은 허용
            주어진 Key가 이미 존재한다면, 해당 Key에 대한 Value만 업데이트

 HashSet -> Set 인터페이스의 구현체로, 내부적으로 HashMap을 사용
 (Key 값으로는 삽입되는 객체 그 자체를, Value 값으로는 HashSet 내부 구현 코드에서 미리 선언해둔 dummy 객체를 사용)
            HashSet은 객체 자체를 데이터로 저장하기 때문에 중복을 허용X
 */