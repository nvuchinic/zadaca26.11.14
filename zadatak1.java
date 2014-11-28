package zadaca;

public class zadatak1 {
	
	/**
	 * funkcija koja vraca sumu cifara unesenog broja
	 * @param n broj ciju sumu cifara iyracunavamo
	 * @return sumu cifara unesenog broja
	 */
	public static int sumCifara(int n){
		int sumC=0,cif;
		while(n>0){
			cif=n%10;
			sumC=sumC+cif;
			n=n/10;
		}
		return sumC;
	}
	
public static void main(String[] args) {
	System.out.println("Unesite neki broj:");
	int n=TextIO.getInt();
	int s=sumCifara(n);
	System.out.println("Suma cifara tog broja je "+s);
}
}
