

public class T8_3Methods {

	static int MyMethod (int x) {
		int f = x;
		for (int i = 1; i < x; i++) {f = f * i;}
		return f;
	}
	
	static String MyMethod (String x) {
		int n = x.length() - 1;
		String s = "";
		for (int i = n; i >= 0; i--) {s = s + x.charAt(i);}
		return s;
	}
	
	static boolean MyAnotherMethod (int x) {
		boolean b = true;
		for (int i = 2; i < x; i++) {if (x % i == 0) {b = false;}}  
		return b;
	}
	
	public static void main(String[] args) throws java.io.IOException {
		java.io.BufferedReader in=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.print("����� ��� ���������� ����������: ");
		int n = Integer.parseInt(in.readLine());
		System.out.println("��������� ����� " +MyMethod(n));
		System.out.print("������ ��� �����������: ");
		String s = in.readLine();
		System.out.println("������-����������: " +MyMethod(s));
		System.out.println("����� ��� �������� �� �������: ");
		int n1 = Integer.parseInt(in.readLine());
		if (MyAnotherMethod(n1)) System.out.println("�������."); else System.out.println("���������.");
	}
}
