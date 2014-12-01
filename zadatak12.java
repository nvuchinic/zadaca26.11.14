package zadaca;

import java.util.Scanner;

public class zadatak12 {
	/**
	 * funkcija koja prima cijeli broj, a vraca njegovu binarnu reprezentaciju u formi stringa
	 * @param n cijeli broj
	 * @return string 
	 */
	public static String binarniBroj(int n){
		String binarniBr="";
		int binC;  //binarna cifra(0 ili 1)
		while(n>0){
			binC=n%2;
			binarniBr=binarniBr+binC;
			System.out.println();
			n=n/2;
		}
		while(binarniBr.length()<8){
			binarniBr=0+binarniBr;
		}
			return binarniBr;
	}
	
public static void main(String[] args) {
	int br;
	Scanner in=new Scanner(System.in);
	System.out.println("Unesite cijeli broj:");
	br=in.nextInt();
	System.out.println(binarniBroj(br));
}
}
