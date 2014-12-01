package zadaca;

import java.util.Scanner;

public class zadatak10 {
	/**
	 * funkcija koja prim string, a vraca poslednju rijec u tom stringu
	 * @param str string
	 */
	public static void printLastWord(String str){
		str=str.trim();
		int duz=str.length();				//16
		String obrLastWord="";
		int indStr=duz;						//16
		while(str.charAt(indStr-1)!=' '){
			indStr--;
			obrLastWord=obrLastWord+str.charAt(indStr);
		
		//System.out.println(indStr);
		if(indStr==0)
			break;
		}
		int duzZR=obrLastWord.length();
		String lastWord="";
		for(int i=duzZR-1;i>=0;i--){
			lastWord=lastWord+obrLastWord.charAt(i);
		}
		//System.out.println(obrLastWord);
		System.out.println(lastWord);
	}
	
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Unessite string:");
	String mojString=in.nextLine();
	printLastWord(mojString);
}
}
