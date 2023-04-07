package sort.bubble;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
			if (!sorted)
				printArray(arr);
		}				
		return arr;
	}
	
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
	        if (i < arr.length - 1) {
	            System.out.print(" ");
	        }
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		try {
			BufferedReader myreader = new BufferedReader(new FileReader("sort/bubble/input100.txt"));
			String line = myreader.readLine();
			int [] array;
			while (line != null) {
				String[] num = (line.split(" "));
				array = new int[Integer.parseInt(num[1])];			
				for (int i = 0; i < array.length; i++) {
					array[i] = Integer.parseInt(num[2+i]);
				}			
				bubbleSort(array);				
				line = myreader.readLine();
			}
			myreader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
