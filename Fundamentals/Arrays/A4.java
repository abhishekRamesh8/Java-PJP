import java.util.*;
public class A4 {
public static void main(String[] args) {
	int[] arr = new int[4];
	Scanner sc = new Scanner(System.in);
	for(short i=0; i<arr.length; i++) {
		arr[i] = sc.nextInt();
	}
	for(int i: arr) {
		System.out.print((char)i);
	}
	sc.close();
}
}
