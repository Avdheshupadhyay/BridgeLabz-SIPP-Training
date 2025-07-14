// Bubble Sort - Sort Student Marks
public class BubbleSortStudentMarks {
    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] marks = {78, 55, 89, 90, 66, 72};
        System.out.print("Original marks: ");
        for (int mark : marks) System.out.print(mark + " ");
        System.out.println();
        bubbleSort(marks);
        System.out.print("Sorted marks: ");
        for (int mark : marks) System.out.print(mark + " ");
        System.out.println();
    }
}
