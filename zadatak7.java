package zadaca;

public class zadatak7 {
	/**
	 * funkcija koja prima string, a ispisuje rijeci tog stringa koje predstavljaju palindrome
	 * @param str string
	 */
	public static void ispisiPalindrom(String str){
		int duz=str.length();
		String trString="";
		int sredina;
		int indStr=0;						//ana je zatvorila kapak
	
		while(indStr<duz){
			while(str.charAt(indStr)!=' '){
			trString=trString+str.charAt(indStr);		//ana
		indStr++;										//1,2,3,
		if(indStr==duz)
			break;
		}
		//System.out.println("String: "+trString);
		sredina=trString.length()/2+1;
		String polovina1=trString.substring(0, sredina-1);
		//System.out.println("Prva polovina stringa: "+polovina1);
		String polovina2=trString.substring(sredina);
		//System.out.println("Druga polovina stringa: "+polovina2);
		String obrnutaPolovina2="";
		for(int i=polovina2.length()-1;i>=0;i--)
			obrnutaPolovina2=obrnutaPolovina2+polovina2.charAt(i);
		//System.out.println("Obrnuta polovina: "+obrnutaPolovina2);
		if(polovina1.equals(obrnutaPolovina2))
			System.out.println("Palindrom: "+trString);
		indStr++;
		trString="";
	}
	}
	public static void main(String[] args) {
		String mojString="ana je zatvorila kapak";
		ispisiPalindrom(mojString);
	}

}
