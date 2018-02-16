
public class QuickSort {
	int arr[];
	public static void main(String args[]) {
		int input[] = {4,2,5,1,3,8,9,11,7};
		
		QuickSort quickSort = new QuickSort();
		quickSort.sort(input);
		
		for(int i=0;i<input.length;i++) {
			System.out.println(input[i]);
		}
	}
	
	void sort(int input[]) {
		this.arr = input;
		this.quickSort(0, arr.length-1);
	}
	
	void quickSort(int lowerIndex, int higherIndex) {
		int i = lowerIndex;
		int j = higherIndex;
		int pivot = arr[lowerIndex + (higherIndex - lowerIndex)/2];
		
		while(i<=j) {
			while(arr[i] < pivot) {
				i++;
			}
			while(arr[j] > pivot) {
				j--;
			}
			if(i<=j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		if(lowerIndex < j) {
			quickSort(lowerIndex,j);
		}
		if(higherIndex > i) {
			quickSort(i,higherIndex);
		}
		
	}
}
