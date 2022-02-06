package bucles;

public class Break {

	public static void main(String[] args) {
		
		for (int i =0;i<10;i++) {
			if (i ==4) {
				//break;
				continue;// Salta y no imprime 4
			}
			System.out.println(i);
		}
	}

}
