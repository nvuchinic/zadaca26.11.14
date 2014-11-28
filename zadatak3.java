package zadaca;

import java.util.Scanner;

public class zadatak3 {
	/**
	 * funkcija koja prima niz a zatim pomjera sve elemente za jednu poziciju ulijevo
	 * (pri tome se prvi elemnt gubi, a zadnji dobija vrijednost 0)
	 * @param niz niz cije elemente cemo pomjerati ulijevo jednu poziciju
	 */
	public static void pomjeriLijevo(int[] niz){
		for(int i=0;i<niz.length-1;i++)
			niz[i]=niz[i+1];
		niz[niz.length-1]=0;
		System.out.println("\n\nNiz pomjeren ulijevo:");
	}
	
	public static void unosNiza(int[] n){
		Scanner input=new Scanner(System.in);
		for(int i=0;i<n.length;i++){
			System.out.println("Unesite element niza:");
			int e=input.nextInt();
			n[i]=e;
		}
		input.close();
	}
	
	public static void ispisNiza(int[] n){
		for(int i=0;i<n.length;i++)
			System.out.print(n[i]+", ");
	}
	
public static void main(String[] args) {
		System.out.println("Koliko zelte clanova niza:");
		int brE=TextIO.getInt();
	int[] niz=new int[brE];
	unosNiza(niz);
	ispisNiza(niz);
	pomjeriLijevo(niz);
	ispisNiza(niz);

}
}
