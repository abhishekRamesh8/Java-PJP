public class jf21 {
	public static void main(String[] args) {
		short num = 1;
		byte i = 1;
		while (i <= 5) {
			if (num % 2 == 0 && num % 3 == 0 && num % 5 == 0) {
				System.out.println(num);
				i++;
			}
			num++;
		}
	}
}
