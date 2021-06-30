import java.util.*;


public class A2 {
public static void main(String[] args) {
	int[] arr = new int[4];
	int min_val = Integer.MAX_VALUE;
	int max_val = Integer.MIN_VALUE;
	Scanner sc = new Scanner(System.in);
	for(int i=0; i < arr.length; i++) {
		arr[i] = sc.nextInt();
	}
	for(int i: arr) {
		if(i < min_val) {
			min_val = i;
		}
		if(i > max_val) {
			max_val = i;
		}
	}
	System.out.printf("The min and max value of array %s is %d and %d", java.util.Arrays.toString(arr), min_val, max_val);
	sc.close();
}
}
