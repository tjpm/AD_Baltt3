
public class QuicksortRechts implements PivotStrategie{
	
    public <T extends Comparable<T>> void sortieren(T[] arr) {
    	sortieren(arr, 0, arr.length - 1);
    }

    private <T extends Comparable<T>> void sortieren(
            T[] arr, int links, int rechts) {
        if (links < rechts) {
            int pivot = partition(arr, links, rechts);
            sortieren(arr, links, pivot - 1);
            sortieren(arr, pivot + 1, rechts);
        }
    }

    private <T extends Comparable<T>> int partition(
            T[] arr, int links, int rechts) {
        T pivot = arr[rechts];
        int mid = links;
        for (int i = mid; i < rechts; i++) {
            if (arr[i].compareTo(pivot) <= 0) {
                swap(arr, i, mid++);
            }
        }
        swap(arr, rechts, mid);
        return mid;
    }

    private <T extends Comparable<T>> void swap(
            T[] arr, int a, int b) {
        if (a != b) {
            T temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
    }
}
