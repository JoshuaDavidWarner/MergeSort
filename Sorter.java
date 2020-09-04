package p1.jw2684.merge;

/**
 * 
 * The merge-sort algorithm in Java
 * 
 * @author joshua warner
 *
 */
public class Sorter {

	
	/**
	 * This is the sort method used to sort items.
	 * @param <T>
	 * @param items
	 */
	public static <T extends Comparable<T>> void sort(T[] items) {

		mergeSort(items);



	}

	/**
	 * Merges the mergeSort methods
	 * @param <T>
	 * @param items
	 * @param left
	 * @param right
	 */
	private static <T extends Comparable<T>> void merge(T[] items, T[] left, T[] right) {



		int i = 0;
		int j = 0;
		int sort = 0;
		

		
		while (i < left.length && j < right.length ) {
			
			
			if (left[i].compareTo(right[j]) < 0) {
				

				items[sort] = left[i];
				i++;
				sort++;
			
		
			}

			else {
				items[sort] = right[j];
				j++;
				sort++;
				

			}

		}
		
		//found this code online which merges the group that is already sorted
		System.arraycopy(left, i, items, sort, left.length - i);
		System.arraycopy(right, j, items, sort, right.length - j);

	}

	/**
	 * Divides and conquers an items list.
	 * @param <T>
	 * @param items
	 */
	private static <T extends Comparable<T>> void mergeSort(T[] items) {
		
		if (items.length <= 1) {return;}
		T[] left = (T[]) new Comparable[items.length/2];
		T[] right = (T[]) new Comparable[items.length - left.length];

		
		for(int i = 0; i < left.length;i++) {
			left[i] = items[i];
		}
		for(int i = 0 ; i < right.length;i++) {
			right[i] = items[left.length + i];
		}
		
		mergeSort(left);
		mergeSort(right);
		merge(items,left,right);



	}

}
