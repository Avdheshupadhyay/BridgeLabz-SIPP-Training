// Heap Sort - Sort Job Applicants by Salary
public class HeapSortJobApplicants {
    public static void heapSort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && arr[l] > arr[largest])
            largest = l;
        if (r < n && arr[r] > arr[largest])
            largest = r;
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] salaries = {35000, 50000, 27000, 45000, 32000};
        System.out.print("Original salaries: ");
        for (int salary : salaries) System.out.print(salary + " ");
        System.out.println();
        heapSort(salaries);
        System.out.print("Sorted salaries: ");
        for (int salary : salaries) System.out.print(salary + " ");
        System.out.println();
    }
}
