import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int me;
        int[] arr = new int[n];

        String[] inputs = br.readLine().split(" ");
        
        me = Integer.parseInt(inputs[0]);

        for (int i = 1; i < n; i++) {
            arr[i - 1] = Integer.parseInt(inputs[i]);
        }

        Arrays.sort(arr); // 1 단 정렬을 해.
        // => 맨 마지막 친구가 제일 큰 경쟁자임
        // 내 지지자와 쟤네 지지자 사이 어딘가에 타협지점이 있음
        // => 이분 탐색? (10^9승이면 진짜 쭉 돌라는 의도는 아님. 반씩 나눠서 보는 발상이 맞을듯)

        int left = me; // 내 지지자부터 시작.
        int right = arr[arr.length - 1]; // 맨 우측 많은 제일 많은 친구부터 시작
        int result = Integer.MAX_VALUE;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;

            int persuaded = 0;
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] <= mid) break;
                persuaded += arr[i] - mid;
            }

            int cur = me + persuaded;
            if (cur > mid) { // 이러면 이길거임
                result = Math.min(result, persuaded);
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        System.out.print(result);
    }
}
