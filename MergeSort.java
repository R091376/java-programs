
public class MergeSort {
	private int arr[];
	private int tempArr[];
	private int length;
	
	public static void main(String[] args) {
		int inputArr[] = {4,2,5,1,3,8,9,11,7};
		MergeSort merge = new MergeSort();
		merge.mergeSort(inputArr);
		for(int i=0;i<inputArr.length;i++) {
			System.out.println(inputArr[i]);
		}
	}
	
	public void mergeSort(int[] inputArr) {
		this.arr = inputArr;
		this.length = arr.length;
		this.tempArr = new int[length];
		divide(0,length-1);
	}
	
	public void divide(int lowerIndex, int higherIndex) {
		if(lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex)/2;
			divide(lowerIndex,middle);
			divide(middle+1,higherIndex);
			merge(lowerIndex, middle, higherIndex);
		}
	}
	public void merge(int lowerIndex, int middle, int higherIndex) {
		for(int i=lowerIndex; i<higherIndex ; i++) {
			tempArr[i] = arr[i];
		}
		
		int i = lowerIndex;
		int j = middle+1;
		int k = lowerIndex;
		
		while(i<= middle && j<higherIndex) {
			if(tempArr[i] <= tempArr[j]) {
				arr[k] = tempArr[i];
				i++;
			}else {
				arr[k] = tempArr[j];
				j++;
			}
			k++;
		}
		while(i<= middle) {
			arr[k] = tempArr[i];
			k++;
			i++;
		}
		while(j< higherIndex) {
			arr[k] = tempArr[j];
			k++;
			j++;
		}
		
		for(i=lowerIndex;i<higherIndex;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

}
