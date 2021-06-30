public class jf19 {
	public static void main(String[] args) {

		short num = (short) Integer.parseInt(args[0]);
		for (byte i = 0; i <= num; i++) {
			String result = new String(new char[i]).replace("\0", "*");
			System.out.println(result);

		}
	}
}
