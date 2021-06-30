import java.util.*;
public class A3 {
public static void main(String[] args) {
	int[] arr = new int[4];
	Scanner sc = new Scanner(System.in);
	for(int i = 0; i<arr.length; i++) {
		arr[i] = sc.nextInt();
	}
	int find = sc.nextInt();
	
	if (Arrays.binarySearch(arr, find) > 0) {
		System.out.println(Arrays.binarySearch(arr, find));
		}
	else {
		System.out.println(-1);
		
		}
	sc.close();
}
}
