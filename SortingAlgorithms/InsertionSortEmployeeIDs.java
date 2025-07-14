// Insertion Sort - Sort Employee IDs
public class InsertionSortEmployeeIDs {
    public static void insertionSort(int[] ids) {
        for (int i = 1; i < ids.length; i++) {
            int key = ids[i];
            int j = i - 1;
            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }
            ids[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] ids = {104, 102, 108, 101, 105};
        System.out.print("Original IDs: ");
        for (int id : ids) System.out.print(id + " ");
        System.out.println();
        insertionSort(ids);
        System.out.print("Sorted IDs: ");
        for (int id : ids) System.out.print(id + " ");
        System.out.println();
    }
}
