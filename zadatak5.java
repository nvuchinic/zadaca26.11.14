package zadaca;

import java.util.Scanner;

public class zadatak5 {
	
/**
 * funkcija koja prima string i karakter, zatim djeli string na dva stringa na mjestu tog karaktera,
 * i na kraju sve te stringove stavlja u niz i vraca ga
 * @param str string
 * @param c neki karakter
 * niz stringo
 * @return
 */
	public static String[] razdijeli(String str, char c)
	{
		int brC=0;
		int duzS=str.length();
		for(int i=0;i<duzS;i++){
			if(str.charAt(i)==c){
				brC++;
			}
		}
		System.out.println(brC);
		int vel;
		if((str.charAt(0)==c)||(str.charAt(duzS-1)==c))
			vel=brC;
		if((str.charAt(0)==c)&&(str.charAt(duzS-1)==c))
			vel=brC-1;											//"danas je vedar dan";
		else vel=brC+1; 
		System.out.println(vel);
		String[] nizS=new String[vel];
		int nizI=0;
		int strI=0;
		String trString="";
		
		while(nizI<vel){
			while((str.charAt(strI)!=c)&&(strI<=str.length()-1)){
				trString=trString+str.charAt(strI);		 //"d","n","s je ved","r d",n
				strI++;	
				if(strI==18)					//1,3,5,6,7,8,9,10,11,12,13,14,15,17
					break;
			}
			System.out.println(trString);
			strI=strI+1;								//2,4,13,16

			nizS[nizI]=trString;						//d,n,s je ved,r d,
			trString="";								//""
			nizI++;											//1,2,3,4
				}
		return nizS;
	}
	
	public static void main(String[] args) {
	String mojString =new String();
	System.out.println("Unesi string:");
	mojString=TextIO.getln();
	System.out.println("Unesi znak:");
	char c=TextIO.getChar();
	String[] mojStringNiz=new String[mojString.length()];
	mojStringNiz=razdijeli(mojString, c);
	
	for(int i=0;i<mojStringNiz.length;i++)
		System.out.print(mojStringNiz[i]+", ");
		
	}
}
