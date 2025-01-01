// import java.util.*;

// class Solution {
//     public int solution(int[] priorities, int location) {
//         Queue<Process> queue = new LinkedList<>();
//         for (int i = 0; i < priorities.length; i++) {
//             queue.add(new Process(i, priorities[i]));
//         }
        
//         int order = 0;
        
//         while (!queue.isEmpty()) {
//             Process current = queue.poll();
            
//             if (hasHigherPriority(queue, current.priority)) {
//                 queue.add(current);
//             } else {
//                 order++; // 실행 횟수 증가
//                 // 원하는 프로세스면 종료
//                 if (current.index == location) {
//                     return order;
//                 }
//             }
//         }
        
//         return order;
//     }
    
//     private boolean hasHigherPriority(Queue<Process> queue, int currentPriority) {
//         for (Process p : queue) {
//             if (p.priority > currentPriority) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }

// // 인덱스와 우선순위를 함께 저장할 클래스
// class Process {
//     int index;// 원래 위치
//     int priority; // 우선순위
    
//     Process(int index, int priority) {
//         this.index = index;
//         this.priority = priority;
//     }
// }

// // 테스트 1 〉	통과 (1.10ms, 88.7MB)
// // 테스트 2 〉	통과 (2.32ms, 76.7MB)
// // 테스트 3 〉	통과 (0.65ms, 85.3MB)
// // 테스트 4 〉	통과 (0.80ms, 87MB)
// // 테스트 5 〉	통과 (0.42ms, 70.2MB)
// // 테스트 6 〉	통과 (0.82ms, 80.7MB)
// // 테스트 7 〉	통과 (1.05ms, 84.9MB)
// // 테스트 8 〉	통과 (2.06ms, 86.6MB)
// // 테스트 9 〉	통과 (0.74ms, 82.8MB)
// // 테스트 10 〉	통과 (1.04ms, 71.6MB)
// // 테스트 11 〉	통과 (1.93ms, 78.9MB)
// // 테스트 12 〉	통과 (0.52ms, 78.2MB)
// // 테스트 13 〉	통과 (2.03ms, 86MB)
// // 테스트 14 〉	통과 (0.45ms, 86.4MB)
// // 테스트 15 〉	통과 (0.45ms, 89.8MB)
// // 테스트 16 〉	통과 (0.55ms, 85MB)
// // 테스트 17 〉	통과 (1.98ms, 91.7MB)
// // 테스트 18 〉	통과 (0.68ms, 87.8MB)
// // 테스트 19 〉	통과 (1.25ms, 84.2MB)
// // 테스트 20 〉	통과 (0.79ms, 80.3MB)


import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Process> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new Process(priorities[i], i));
        }

        List<Integer> sortedPriorities = new ArrayList<>();
        for (int priority : priorities) {
            sortedPriorities.add(priority);
        }
        Collections.sort(sortedPriorities, Collections.reverseOrder());

        int executeOrder = 0;


        for (int priority : sortedPriorities) {
            while (!queue.isEmpty()) {
                Process current = queue.poll();
                if (current.priority == priority) {
                    executeOrder++;
                    if (current.location == location) {
                        return executeOrder;
                    }
                    break;
                } else {
                    queue.offer(current);
                }
            }
        }

        return -1;
    }
}

class Process {
    int priority;
    int location;

    Process(int priority, int location) {
        this.priority = priority;
        this.location = location;
    }
}