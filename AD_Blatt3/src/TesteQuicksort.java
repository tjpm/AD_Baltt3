import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class TesteQuicksort
{
	private PivotStrategie quicksort;
	public TesteQuicksort() {
		quicksort = new QuicksortZufall();
	}
	
	@Test
	public void testeQuicksortRandom() {
		long average = 0;
		for(int k =0;k< 100;++k) {
			int arrGroesse = 3 + (int)(Math.random() * 1000);
			Integer[] arr = initialisiereTestArrayRandom(arrGroesse);
			//System.out.println("Unsortiert:");
			//System.out.println(Arrays.toString(arr));
			long time = System.nanoTime();
			quicksort.sortieren(arr);
			average += (System.nanoTime() - time);
			boolean test = false;
			for(int i = 0; i < arrGroesse-1;++i) {
				if(arr[i]<=arr[i+1]) {
					test = true;
				}
				else {
					test = false;
					break;
				}
			}
			//System.out.println("Sortiert:");
			//System.out.println(Arrays.toString(arr));
			assertEquals(true,test);
		}
		System.out.println("Random:");
		System.out.println(average/100);
	}
	
	@Test
	public void testeQuicksortAufsteigend() {
		long average = 0;
		for(int k =0;k< 100;++k) {
			int arrGroesse = 3 + (int)(Math.random() * 1000);
			Integer[] arr = initialisiereTestArrayAufteigend(arrGroesse);
			//System.out.println("Unsortiert:");
			//System.out.println(Arrays.toString(arr));
			long time = System.nanoTime();
			quicksort.sortieren(arr);
			average += (System.nanoTime() - time);
			boolean test = false;
			for(int i = 0; i < arrGroesse-1;++i) {
				if(arr[i]<=arr[i+1]) {
					test = true;
				}
				else {
					test = false;
					break;
				}
			}
			//System.out.println("Sortiert:");
			//System.out.println(Arrays.toString(arr));
			assertEquals(true,test);
		}
		System.out.println("Aufsteigend:");
		System.out.println(average/100);
	}
	
	@Test
	public void testeQuicksortAbsteigend() {
		long average = 0;
		for(int k =0;k< 100;++k) {
			int arrGroesse = 3 + (int)(Math.random() * 1000);
			Integer[] arr = initialisiereTestArrayAbteigend(arrGroesse);
			//System.out.println("Unsortiert:");
			//System.out.println(Arrays.toString(arr));
			long time = System.nanoTime();
			quicksort.sortieren(arr);
			average += (System.nanoTime() - time);
			boolean test = false;
			for(int i = 0; i < arrGroesse-1;++i) {
				if(arr[i]<=arr[i+1]) {
					test = true;
				}
				else {
					test = false;
					break;
				}
			}
			//System.out.println("Sortiert:");
			//System.out.println(Arrays.toString(arr));
			assertEquals(true,test);
		}
		System.out.println("Absteigend:");
		System.out.println(average/100);
	}
	
	private Integer[] initialisiereTestArrayRandom(int groesse) {
		Integer[] arr = new Integer[groesse];
		Set<Integer> set = new HashSet<Integer>();
		while(set.size()< groesse) {
			for(int i = 0; i < groesse; ++i) {
				set.add(1 + (int)(Math.random() * groesse * 100));
			}
		}
		int o = 0;
		for(Integer i : set) {
			if(o < groesse) {
				arr[o] = i;
				++o;
			}
			else {
				break;
			}
		}
		return arr;
	}
	
	private Integer[] initialisiereTestArrayAufteigend(int groesse) {
		Integer[] arr = new Integer[groesse];
		for(int i = 0; i < groesse; ++i) {
			arr[i] = i;
		}
		return arr;
	}
	
	private Integer[] initialisiereTestArrayAbteigend(int groesse) {
		Integer[] arr = new Integer[groesse];
		int z = groesse - 1;
		for(int i = 0; i < groesse; ++i) {
			arr[i] = z;
			--z;
		}
		return arr;
	}
}
