import java.io.File;

public class T7_Room_Order {
	T7_Room_Order() throws java.io.IOException {
		String target_room = "";
		int target_room_capacity = 1;
		boolean not_selected = true;
		java.io.File hotel = new java.io.File("C:\\hotel.txt");
		java.io.DataInputStream fin = new java.io.DataInputStream(new java.io.FileInputStream(hotel));
		int n = Integer.parseInt(fin.readLine());
		String[] room_file = new String[n];
		int[] person_file = new int[n];
		for (int i=0; i<n; i++) {
			room_file[i] = fin.readLine();
			person_file[i] = Integer.parseInt(fin.readLine());
		}
		java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
	System.out.println("вв ФИО заказчика");
	String person = in.readLine();
	System.out.println("вв кол-во жильцов");
	int person_req = Integer.parseInt(in.readLine());
	for (int i=0; i<n; i++) {
		if ( (person_file[i] <= person_req+person_req/10) && (person_file[i] >= person_req) ) {
			target_room = room_file[i];
			target_room_capacity = person_file[i];
			not_selected = false;
			break;
		}
	}
	if (not_selected) {
		for (int i=0; i<n; i++) {
			if (person_req<=person_file[i]) {
				target_room=room_file[i];
				target_room_capacity=person_file[i];
				break;
			}
		}
	}
//----------------------------------------------------------------------------------------- 
	System.out.println ("Отчёт о заказе.");
	System.out.println ("ФИО заказчика: "+person);
	System.out.println ("Количество жильцов: "+person_req);
	System.out.println ("Номер комнаты: "+target_room);
	System.out.println ("Вместимость комнаты: "+target_room_capacity+" человек");
}

public static void main(String[] args) throws java.io.IOException {
  // TODO Auto-generated method stub
new T7_Room_Order();
}
}