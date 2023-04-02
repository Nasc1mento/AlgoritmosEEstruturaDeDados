package sort.bubble;

public class BubbleSort {

	public static int[] bubbleSort(int[] arr) {
		boolean sorted = false;
		while(!sorted) {
			sorted = true;
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] < arr[i-1]) {
					int temp = arr[i];
					arr[i] = arr[i-1];
					arr[i-1] = temp;
					sorted = false;
				}
			}
		}				
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {-2, -3, -5, 10, -1, -10, 50};
		bubbleSort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
