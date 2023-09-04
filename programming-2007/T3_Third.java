public class T3_Third {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 5.0, b = 2.0, c = 3.0, d = 4.0;
		double x = a;
		if (x<b) {
				  x=b; if (x<c){
					  			x=c; if (x<d) x=d;
				  	  		   }
			}
		System.out.println("Максимальный элемент: "+ x);
	}

}
