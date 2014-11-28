package zadaca;

import java.util.Scanner;

public class zadatak20 {
	/**
	 * funkcija koja prima dva dvodimenzionalna niza, 
	 * a vraca treci niz ciji elementi su rezultat sabiranja odgovarajucih elemenata prva dva niza
	 * @param niz1 prvi dvodimenzionalni niz koj se unosi kao parametar, i 
	 * koji zajedno sa drugim unesenim nizom sluzi za kreiranje treceg niza
	 * @param niz2 drugi dvodimenzionalni niz koji se unosi kao parametar
	 * @return
	 */
	public static int[][] saberiMatrice(int[][] niz1, int[][] niz2){
		int red=niz1.length;
		int kolona=niz1[0].length;
		int[][] niz3=new int[red][kolona];
		for(int i=0;i<red;i++){
			for(int j=0;j<kolona;j++){
				niz3[i][j]=niz1[i][j]+niz2[i][j];
			}
		}
		return niz3;
	}
	
	public static void unosNiza(int[][] n){
		int red=n.length;
		int kolona=n[0].length;
		for(int i=0;i<red;i++){
			for(int j=0;j<kolona;j++){
			System.out.println("Unesite element niza:");
			int e=TextIO.getInt();
			n[i][j]=e;
			}
		}
	}
	
public static void main(String[] args) {
	int red, kol;
	Scanner unos=new Scanner(System.in);
	System.out.println("Unesi dimenzije matrice(broj redova i broj kolona):");
	red=unos.nextInt();
	kol=unos.nextInt();
	unos.close();
	int[][] n1=new int[red][kol];
	int[][] n2=new int[red][kol];
	int[][] n3=new int[red][kol];
	unosNiza(n1);
	unosNiza(n2);
	n3=saberiMatrice(n1, n2);
	
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
		System.out.print(n3[i][j]+" ");
		}
		System.out.println();
		}
}
}
