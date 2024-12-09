import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class MarathonRunner {
    public static void main(String[] args) {
        Solution_marathon sol = new Solution_marathon();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(sol.solution(participant, completion)); // 출력: "leo"
    }
}

class Solution_marathon {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();

        // 참가자 목록에서 각 이름의 카운트를 증가시킴
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        // 완주자 목록에서 각 이름의 카운트를 감소시킴
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }

        // 참가자 중 완주하지 않은 사람을 찾음
        for (String key : map.keySet()) {
            if (map.get(key) > 0) {
                return key; // 카운트가 1 이상인 이름 반환
            }
        }

        return ""; // 이 줄은 실행되지 않음
    }
}
