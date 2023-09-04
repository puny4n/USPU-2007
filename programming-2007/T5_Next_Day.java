public class T5_Next_Day {

	public static void main(String[] args) throws java.io.IOException {
		T5_Next_Day thisclass = new T5_Next_Day();
		thisclass.somemethod();
	}

	void somemethod() throws java.io.IOException {
		int day, month, year;
		boolean error;
		java.io.BufferedReader in = new java.io.BufferedReader (new java.io.InputStreamReader(System.in));
		System.out.println("вв день");
		day = Integer.parseInt(in.readLine());
		System.out.println("вв месяц");
		month = Integer.parseInt(in.readLine());
		System.out.println("вв год");
		year = Integer.parseInt(in.readLine());
		error = true;
		if ((month<13)&(month>0)&(year>0)) switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: if ((day>0)&(day<32)) {
			error = false;
			if (day<31) day++; else {day = 1; month++;} //day==31
			break;
		} //case
		case 4: case 6: case 9: case 11: if ((day>0)&(day<31)) {
			error = false;
			if (day<30) day++; else {day = 1; month++;} //day==30
			break;
		} //case
		case 2: {
			boolean isLeapYear;
			if (year%4 == 0) isLeapYear = true; else isLeapYear = false;
			if (isLeapYear) {
				if ((day>0)&(day<30)) {
					error = false;
					if (day<29) day++; else {day = 1; month++;} //day==29
				} //error
			} //isLeapYear
			if (!isLeapYear) {
				if ((day>0)&(day<29)) {
					error = false;
					if (day<28) day++; else {day = 1; month++;} //day==28
				} //error
			} //!isLeapYear
			break;
		} //case
		case 12: if ((day>0)&(day<32)) {
			error = false;
			if (day<31) day++; else {day = 1; month = 1; year++;} //day==31
			break;
		} //case
		} //switch
		if (error == false) System.out.println(day+"."+month+"."+year);
			else System.out.println("Дата  "+day+"."+month+"."+year+ " не существует");
	}

/**
	void calendar () throws IOException {
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
    	SimpleDateFormat sdf = new SimpleDateFormat ("dd mmmm yyyy");

		Calendar cal = new GregorianCalendar();
		System.out.println("�� ����");
		cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(in.readLine()));
		System.out.println("�� �����");
		cal.set(Calendar.MONTH, Integer.parseInt(in.readLine()));
		System.out.println("�� ���");
		cal.set(Calendar.YEAR, Integer.parseInt(in.readLine()));
		boolean DateExists = true;

    	switch (cal.get(Calendar.DAY_OF_MONTH)) {
		case 1: case 3: case 5: case 7: case 8: case 10:
			if (cal.get(Calendar.DAY_OF_MONTH)==31) {
				cal.set(Calendar.DAY_OF_MONTH, 1);
				cal.add(Calendar.MONTH, 1);
			} else {
				if ((cal.get(Calendar.DAY_OF_MONTH)<31)&(cal.get(Calendar.DAY_OF_MONTH)>0)) {
					cal.add(Calendar.DAY_OF_MONTH, 1);
				} else DateExists = false;
			} //case 1: case 3: case 5: case 7: case 8: case 10:
		case 4: case 6: case 9: case 11:
			if (cal.get(Calendar.DAY_OF_MONTH)==30) {
				cal.set(Calendar.DAY_OF_MONTH, 1);
				cal.add(Calendar.MONTH, 1);
			} else {
				if ((cal.get(Calendar.DAY_OF_MONTH)<31)&(cal.get(Calendar.DAY_OF_MONTH)>0)) {
					cal.add(Calendar.DAY_OF_MONTH, 1);
				} else DateExists = false;
			} //case 4: case 6: case 9: case 11:
		case 2:
			if ( (cal.isLeapYear(cal.get(Calendar.YEAR))) == true) {
				if (cal.get(Calendar.DAY_OF_MONTH)==29) {
					cal.set(Calendar.DAY_OF_MONTH, 1);
					cal.add(Calendar.MONTH, 1);
				} else {
					if ((cal.get(Calendar.DAY_OF_MONTH)<29)&(cal.get(Calendar.DAY_OF_MONTH)>0)) {
						cal.add(Calendar.DAY_OF_MONTH, 1);
					} // 29<DAY_OF_MONTH>0
				} //isLeapYear == true
			} else {
				if (cal.get(Calendar.DAY_OF_MONTH)==28) {
					cal.set(Calendar.DAY_OF_MONTH, 1);
					cal.add(Calendar.MONTH, 1);
					} else {
						if ((cal.get(Calendar.DAY_OF_MONTH, 1)<28)&(cal.get(Calendar.DAY_OF_MONTH)>0)) {
							cal.add(Calendar.DAY_OF_MONTH, 1);
						} else break;
				}
				}
			}
		}

		cal.add(Calendar.DAY_OF_MONTH, 1);

		System.out.print("����: ");
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.print("�����: ");
		System.out.println(cal.get(Calendar.MONTH));
		System.out.print("���: ");
		System.out.println(cal.get(Calendar.YEAR));
	}
*/

}

