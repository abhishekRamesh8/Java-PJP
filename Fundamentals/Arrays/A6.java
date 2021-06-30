import java.util.*;
public class A6 {
public static void main(String[] args) {
	int[] arr = new int[5];
	Scanner sc = new Scanner(System.in);
	for(int i=0; i<arr.length; i++) {
		arr[i] = sc.nextInt();
		}
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	sc.close();
}
}
