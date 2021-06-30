public class A10 {
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
			byte k = 0;
			int max_val = Integer.MIN_VALUE;
			if(args.length == 9) {
				System.out.println("The given array is: \n");
				for (int i=0; i<3; i++) {
					for(int j=0; j<3; j++) {
						arr[i][j] = Integer.parseInt(args[k]);
						k++;
						if (arr[i][j] > max_val) {
							max_val = arr[i][j];
						}
						System.out.print(arr[i][j]+" ");
					}
					System.out.println('\n');
				}
				System.out.printf("The Biggest number in the given array is: %d\n", max_val);
				
	}	else {
		System.out.println("Please enter 9 integer numbers");
	}
	}
}
