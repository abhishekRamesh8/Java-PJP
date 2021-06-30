public class A1 {
public static void main(String[] args) {
	int[] arr = {1, 2, 3, 4};
	int total = 0;
	for(int i=0;i<arr.length;i++) {
		total += arr[i];
		}
	System.out.printf("Sum is %d, Average is %d", total, (total/arr.length));
	
}
}
