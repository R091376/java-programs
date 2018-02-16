
public class InsertionSort {
	public static void main(String args[]) {
		int arr[] = {4,2,5,1,3,8,9,11,7};
		for(int i=1; i<arr.length;i++) {
			int temp = arr[i];
			int j = i-1;
			while( j>-1 && arr[j] > temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
}
