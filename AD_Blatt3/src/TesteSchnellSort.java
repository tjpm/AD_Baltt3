import static org.junit.Assert.assertEquals;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

public class TesteSchnellSort
{
	private SchnellSort schnell;
	private QuickSort quick;
	private int _k;
	public TesteSchnellSort() {
		quick = new QuickSort();
		_k = 1;
	}
	
	@Test
	public void testeSchnellSort() {
		long average = 0;
		for(int k =0;k< 10;++k) {
			int[] arr = erzeugeArray(_k);
			schnell = new SchnellSort(_k);
			long time = System.nanoTime();
			schnell.sortieren(arr);
			average += (System.nanoTime() - time);
			boolean test = false;
			for(int i = 0; i < arr.length -1;++i) {
				if(arr[i]<=arr[i+1]) {
					test = true;
				}
				else {
					test = false;
					break;
				}
			}
			assertEquals(true,test);
		}
		System.out.println("Zeit SchnellSort: " + average/10);
	}
	
	@Test
	public void testeQuickSort() {
		long average = 0;
		for(int k =0;k< 10;++k) {
			int[] arr = erzeugeArray(_k);
			//Integer[] arr = IntStream.of( ar ).boxed().toArray(Integer[]::new);
			long time = System.nanoTime();
			quick.sortieren(arr);
			average += (System.nanoTime() - time);
			boolean test = false;
			for(int i = 0; i < arr.length -1;++i) {
				if(arr[i]<=arr[i+1]) {
					test = true;
				}
				else {
					test = false;
					break;
				}
			}
			assertEquals(true,test);
		}
		System.out.println("Zeit QuickSort: " + average/10);
	}
	
	
	private int[] erzeugeArray(int k) {
		int[] arr = new int[(int) Math.pow(10, k)];
		int n = arr.length;
		for(int i = 0; i < n; ++i) {
			arr[i] = (int)(Math.random() * ((800 * n) - (700 * n)) + (700 * n));
		}
		return arr;
	}
}
