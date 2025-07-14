// Quick Sort - Sort Product Prices
public class QuickSortProductPrices {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] prices = {1200, 850, 999, 1500, 700};
        System.out.print("Original prices: ");
        for (int price : prices) System.out.print(price + " ");
        System.out.println();
        quickSort(prices, 0, prices.length - 1);
        System.out.print("Sorted prices: ");
        for (int price : prices) System.out.print(price + " ");
        System.out.println();
    }
}
