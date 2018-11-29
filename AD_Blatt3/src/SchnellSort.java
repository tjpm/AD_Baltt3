
public class SchnellSort
{
	private int _k;
	private int _runs;
	
	public SchnellSort(int k) {
		switch(k) {
		case 1: _k = 7500;
			break;
		case 2: _k = 75000;
		break;
		case 3: _k = 750000;
		break;
		case 4: _k = 7500000;
		break;
		case 5: _k = 75000000;
		break;
		case 6: _k = 750000000;
		break;
		}
		_runs = 1;
	}
	public void sortieren(int[] arr) {
		
    	sortierenEins(arr, 0, arr.length - 1);
    }
	public int getK() {
		return _k;
	}
	private void sortierenEins(int[] arr, int links, int rechts) {
        if (links < rechts) {
            int pivot = erstePartition(arr, links, rechts);
            sortieren(arr, links, pivot - 1);
            sortieren(arr, pivot + 1, rechts);
        }
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
//    private int erstePartition(int[] arr, int links, int rechts) {
//        int pivot = _k;
//        int mid = links;
//        for (int i = mid; i < rechts; i++) {
//            if (arr[i] <= pivot) {
//                swap(arr, i, mid++);
//            }
//        }
//        swap(arr, rechts, mid);
//        return mid;
//    }

    private void swap(int[] arr, int a, int b) {
        if (a != b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
    }
    
    

    
    
    
    private int erstePartition(int[] arr, int links, int rechts) {
        int z = -1;
        int piv = 1;
    	for(int i : arr) {
    		++z;
        	int a = Math.abs(i-_k);
        	if(a < _k/75) {
        		
        		break;
        	}
//        	int b = Math.abs(piv-_k);
//        	if(a < b) {
//        		piv = i;
//        		++z;
//        	}
        	
        }
        int pivot = z;
        swap(arr, rechts, pivot);
        return partition(arr, links, rechts);
    }
}
