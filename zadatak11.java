package zadaca;

import java.util.Scanner;

public class zadatak11 {
	
	/**
	 * funkcija koja prima string, a vraca isti string sifriran 
	 * Cezarovom sifrom(svaki znak u stringu zamjenjujemo znakom
	 * koji je tri mjesta ispred u abecedi)
	 * @param str string koji sifriramo
	 * @return sifriran string
	 */
	public static String sifriranString(String str){
		String sifriraniStr=new String();
		char[] nizC=new char[str.length()];
		nizC=str.toCharArray();
		for(int i=0;i<nizC.length;i++){
			nizC[i]=(char) (nizC[i]+3);
			sifriraniStr=sifriraniStr+nizC[i];
		//	System.out.print(nizC[i]);
		}
		return sifriraniStr;
	}
	
	public static void main(String[] args) {
	String myString=new String();
	Scanner in=new Scanner(System.in);
	System.out.println("Unesite string:");
	myString=in.next();
	in.close();
	System.out.println(sifriranString(myString));
}
}
