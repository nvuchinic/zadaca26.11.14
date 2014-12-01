package zadaca;

import java.util.Scanner;

public class zadatak13 {
	
	/**
	 * funkcija koja prima cijeli broj, a vraca njegovu binarnu reprezentaciju 
	 * u formi niza karaktera
	 * @param n cijeli broj
	 * @return string 
	 */
	public static char[] binarniBrojNiz(int n){
		char[] binarniNiz=new char[8];
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
		binarniNiz=binarniBr.toCharArray();
			return binarniNiz;
	}
	
public static void main(String[] args) {
	int br;
	System.out.println("Unesite pozitivan cijeli broj:");
	Scanner in=new Scanner(System.in);
	br=in.nextInt();
	char[] mojNiz=new char[8];
	mojNiz=binarniBrojNiz(br);
	System.out.print("{");
	for(int i=0;i<8;i++){
		System.out.print(mojNiz[i]+", ");
	}
System.out.println("}");}
}
