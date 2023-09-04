import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T6_Sixth {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		T6_Sixth new_object = new T6_Sixth();
		new_object.w();
	}

	void w() throws IOException {
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("вв кол-во линий, одноразрядное число");
		int number = Integer.parseInt(in.readLine());
		if (number>0 & number<10) {
		System.out.println();
		for (int i = 1; i<=number; i++) {
			for (int ii = i; ii>=1; ii--) {System.out.print(i); System.out.print(" "); }
			System.out.println();
			}
	} else System.out.print("число не является одноразрядным, програма завершила работу");
		}
/**
	void v () throws IOException {
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("�� ���-�� �����");
		int number = Integer.parseInt(in.readLine());
		System.out.println();
		int advnum, temp;
		if (number%10 != 0) do {
			temp = number / 10;
			advnum++;
		} while (temp > 0);
		for (int i = 1; i<=number; i++) {
			for (int ii = i; ii>=1; ii--) {
				if (advnum != 0) for (; advnum != 0; advnum--) {
					System.out.print(0);
				}
				System.out.print(i);
				System.out.print(" ");
				}
			System.out.println();
			}
	}
 */
}
