
public class QuickSort
{
	public void sortieren(int[] arr) {
    	sortieren(arr, 0, arr.length - 1);
    }

    private void sortieren(int[] arr, int links, int rechts) {
        if (links < rechts) {
            int pivot = partition(arr, links, rechts);
            sortieren(arr, links, pivot - 1);
            sortieren(arr, pivot + 1, rechts);
        }
    }

    private int partition(int[] arr, int links, int rechts) {
        int pivot = arr[rechts];
        int mid = links;
        for (int i = mid; i < rechts; i++) {
            if (arr[i] <= pivot) {
                swap(arr, i, mid++);
            }
        }
        swap(arr, rechts, mid);
        return mid;
    }

    private void swap(int[] arr, int a, int b) {
        if (a != b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
    }
}
