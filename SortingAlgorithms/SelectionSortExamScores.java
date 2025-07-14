// Selection Sort - Sort Exam Scores
public class SelectionSortExamScores {
    public static void selectionSort(int[] scores) {
        int n = scores.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = scores[minIdx];
            scores[minIdx] = scores[i];
            scores[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] scores = {56, 78, 45, 98, 67};
        System.out.print("Original scores: ");
        for (int score : scores) System.out.print(score + " ");
        System.out.println();
        selectionSort(scores);
        System.out.print("Sorted scores: ");
        for (int score : scores) System.out.print(score + " ");
        System.out.println();
    }
}
