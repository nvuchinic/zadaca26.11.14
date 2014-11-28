package zadaca;

public class zadatak6 {
	/**
	 * funkcija koja prima string, a zatim obrce redoslijed karaktera tog stringa,
	 * i to vraca kao novi string
	 * @param str string koji se unosi, i ciji redoslijed karaktera obrcemo i tako kreiramo novi string
	 * @return vraca string obrnutog redoslieda karaktera u odnosu na uneseni
	 */
	public static String obrniString(String str){
		String obrStr=new String();
		for(int i=str.length()-1;i>=0;i--){
			obrStr=obrStr+str.charAt(i);
		}
		return obrStr;
	}
	
public static void main(String[] args) {
	String string=new String();
	System.out.println("Unesite neki string:");
	string=TextIO.getln();
	String string2=new String();
	string2=obrniString(string);
	System.out.println(string2);
	
}
}
