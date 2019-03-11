package petiZadatak;



public class MyArray {
	
	int[] brojevi;
	
	public MyArray(int[] brojevi) {
		super();
		this.brojevi = brojevi;
	}
	

	 public  int najmanjiElement (int[] brojevi) {
			int minimum= brojevi[0];
			for (int i=0; i< brojevi.length; i+=2) {
				if (brojevi[i] < minimum) 
					minimum= brojevi[i];
	}
			return minimum;
}
	 public  int najveciElement (int[] brojevi) {
				int max = Math.abs(brojevi[0]);
				for (int i=0; i<brojevi.length; i++) {
					if (Math.abs(brojevi[i]) > max )
					max = Math.abs(brojevi[i]);
				}
				return max;
}
	 public  int suma (int [] brojevi) {
		 int zbir = 0;
		 for (int i = 0; i< brojevi.length; i++) {
			 zbir += brojevi[i];
			 
		 }
		 return zbir;
	 }
	 public void ispisiElemente() {
		 for (int i = 0; i< brojevi.length; i++) {
		 System.out.println(brojevi[i]);
		 }
	 }
	
	 
	
}