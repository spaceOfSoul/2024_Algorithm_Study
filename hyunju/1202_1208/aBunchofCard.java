public class aBunchofCard {
    public static void main(String[] args) {

        String []cards1 = {"i", "drink", "water"};
        String []cards2 =	{"want", "to"};
        String []goal =	{"i", "want", "to", "drink", "water"};

        int idx1 = 0; // cards1 배열의 인덱스
        int idx2 = 0; // cards2 배열의 인덱스
        
        // goal 배열 순회
        for (String currentStr : goal) {
            // currentStr이 cards1[idx1] 또는 cards2[idx2]에 포함하는지 확인
            if (idx1 < cards1.length && currentStr.equals(cards1[idx1])) {
                idx1++; // cards1[idx1]에 포함하는 경우 idx1 증가
            } else if (idx2 < cards2.length && currentStr.equals(cards2[idx2])) {
                idx2++; // cards2[idx2]에 포함하는 경우 idx2 증가
            } else {
                System.out.println("No");; // 둘 다 포함하지 않는 경우
            }
        }
        System.out.println("Yes");
    }
}
