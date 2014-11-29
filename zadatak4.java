package zadaca;

import java.util.Scanner;

public class zadatak4 {
	/**
	 * funkcija koja sluzi za unos brojeva od strane korisnika,
	 * funkcija zatim unesene brojeve smjesta u niz, 
	 * i to tako da uvijek smjesti samo posljednjh 10 unesenih brojeva
	 * @return vraca niz od 10 brojeva
	 */
	public static int[] unosBrojeva(){
		int br,i=0;
		int[] niz=new int[10];
		Scanner in=new Scanner(System.in);
		System.out.println("Unesi broj:");
		br=in.nextInt();
		while(br!=-1){
			if(i>9)
				pomjeriLijevo(niz);
				i=9;
				niz[i]=br;
				System.out.println(niz[i]);
				System.out.println("Unesi broj:");
		br=in.nextInt();
		++i;;
		}
		return niz;
	}
	/**
	 * funkcija koja pomjera ulijevo elemente primljenog niza
	 * @param niz
	 */
	public static void pomjeriLijevo(int[] niz){
		for(int i=0;i<niz.length-1;i++)
			niz[i]=niz[i+1];
		niz[niz.length-1]=0;
		//System.out.println("\n\nNiz pomjeren ulijevo:");
	}
	
	/**
	 * funkcija koja ispisuje elemente niza primljenog kao parametar
	 * @param n niz
	 */
	public static void ispisNiza(int[] n){
		for(int i=0;i<n.length;i++){
			System.out.print(n[i]+", ");
		}
	}
	
public static void main(String[] args) {
	int[] nizM=new int[10];
	nizM=unosBrojeva();
	ispisNiza(nizM);
}
}
