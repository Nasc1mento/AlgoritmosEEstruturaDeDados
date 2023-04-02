package sort;

public class InsertionSort {

	public static int[] insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for(int j = i; j > 0; j--) {
				if (arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;					
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 3, 6, 10, -1, -10, 50};
		insertionSort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
