import java.io.*;

public class T4_Fourth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		T4_Fourth firstclass = new T4_Fourth();
		try {
			firstclass.somemethod();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void somemethod () throws IOException {
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("вв число");
		int a = Integer.parseInt(in.readLine());
		//int a = 678543; //вводимое число
		int s = 0;
		int b, t;
		//for (;;) {
		do {
			b = a / 10;
			t = a - b * 10;
			s = s + t;
			a = b;
			//if (a <= 0) break;
		} while (a > 0);
		System.out.println(s);
	}

}
