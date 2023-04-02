package sort.insertion;

public class InsertionSort {

	public static int[] insertionSort(int[] arr) {
//		for (int i = 1; i < arr.length; i++) {
//			for(int j = i; j > 0; j--) {
//				if (arr[j] < arr[j-1]) {
//					int temp = arr[j];
//					arr[j] = arr[j-1];
//					arr[j-1] = temp;					
//				}
//			}
//		}
		for (int j = 2; j < arr.length; j++) {
			int key = arr[j];
			int i = j -1;
			while (i >= 0 && arr[i] > key) {
				arr[i+1] = arr[i];
				i = i -1;
			}
			arr[i+1] = key;
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
