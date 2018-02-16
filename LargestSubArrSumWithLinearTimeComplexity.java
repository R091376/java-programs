
public class LargestSubArrSumWithLinearTimeComplexity {
	public static void main(String args[]) {
		int[] arr = {8,-6,-4,10};
		int sum = arr[0];
		int greatElement = sum;
		for(int i=1;i<arr.length;i++) {
			sum += arr[i];
			if(sum > greatElement) {
				greatElement = sum;
			}else {
				if(arr[i] > greatElement && sum<0) {
					greatElement = arr[i];
				}
				if(sum < 0) {
					sum = 0;
				}
			}
			
		}
		System.out.println(greatElement);
	}
}



/*


*/