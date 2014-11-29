package zadaca;
public class zadatak9 {
	/**
	 * funkcija koja prima znak kao parametar, ispisuje njegov ASCII kod, 
	 * te ispisuje znakove prije, odnosno poslije njega
	 * @param c karakter
	 */
	public static void ispisiZnakove(char c){
		int ascii=c;
		char prvi='!';
		char zadnji='~';
		System.out.println("ASCII tog karaktera je "+ascii);
		System.out.println("Znakovi prije "+c+" \n");
		for(char c2=prvi;c2<c;c2++){
			System.out.print(c2+" ,");
		}
		
		System.out.println("\n\nZnakovi poslije "+c+" \n");
		for(char c3=c;c3<zadnji;c3++)
			System.out.print(c3+" ,");
	}
	
public static void main(String[] args) {
	char c;
	System.out.println("Unesite neki karakkter:");
	c=TextIO.getChar();
	ispisiZnakove(c);
	
	
	


}
}
