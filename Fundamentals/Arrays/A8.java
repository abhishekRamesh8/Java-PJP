import java.util.*;
public class A8 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int n=0; n<arr.length; n++) {
			arr[n] = sc.nextInt();
		}
		int total = 0;
		int br = 0;
		for(int i=0; i<arr.length; i++) {
			if (arr[i] != 6) {
				total += arr[i];
				if (arr[i] == 7) {
					total += 6;
					br = 7;
				}
			}
			else {
				while (i < arr.length) {
				if(br == 7) {
					br -= 7;
						break;
					}else if(arr[i] == 7) {
						break;
					}
				i++;
			}
		}
		
	}
		System.out.println(total);
		sc.close();
	}
}
