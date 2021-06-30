import java.util.*;
public class A5 {

	public static int[] removeTheElement(int[] arr,
            int index)
{

int[] anotherArray = new int[arr.length - 1];

for (int i = 0, k = 0; i < arr.length; i++) {

if (arr[i] == index) {
continue;
}

anotherArray[k++] = arr[i];
}

return anotherArray;
}
public static void main(String[] args) {
	int[] arr = new int[4];
	int min = Integer.MAX_VALUE;
	int max = Integer.MIN_VALUE;
	Scanner sc = new Scanner(System.in);
	for(int i=0; i < arr.length; i++) {
		arr[i] = sc.nextInt();
	}
	

	for(int i: arr) {
		if (i < min) {
			min = i;
		}
		if (i > max) {
			max = i;
		}
	}
	int[] copy = arr;
	System.out.printf("1-min and max value of %s is %d and %d\n", Arrays.toString(arr), min, max);
	arr = removeTheElement(arr, min);

	arr = removeTheElement(arr, max);

	min = Integer.MAX_VALUE;
	max = Integer.MIN_VALUE;
	for(int i: arr) {
		if (i < min) {
			min = i;
		}
		if (i > max) {
			max = i;
		}
	}
	System.out.printf("2-min and max value of %s is %d and %d", Arrays.toString(copy), min, max);
	
	sc.close();
}
}
