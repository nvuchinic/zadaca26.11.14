package zadaca;

public class zadatak17 {
	/**
	 * funkcija koja prima string, i provjerava da li u njemu ima istih susjednih karaktera.
	 * Ako ima ispisuje taj karakter zajedno sa brojem ponavljanja karaktera. 
	 * Ako ne ispisuje originalni string
	 * @param str string
	 * @return string
	 */
	public static String kompresuj(String str){
		str=str.toLowerCase();
		String trenutniStr=new String();
		trenutniStr="";
		String kompresStr="";
		int i=0,brC=1;
		boolean kraj=false;
		while(i<str.length()){
			trenutniStr="";
			trenutniStr+=str.charAt(i);
			if(i==str.length()-1){
				kompresStr+=str.charAt(i);
				break;	
				}
			brC=1;
			while(str.charAt(i)==str.charAt(i+1)){
				brC++;
				i++;
				if(i==str.length()-1){
					kompresStr+=str.charAt(i)+Integer.toString(brC);
					kraj=true;
					break;
				}
				trenutniStr+=str.charAt(i);
			}
			if(brC>1){
				trenutniStr=str.charAt(i)+Integer.toString(brC);
				//System.out.println("trenutni string: "+trenutniStr);
			}
			kompresStr+=trenutniStr;						//n e r m i
			//System.out.println(kompresStr);
			i++;											//1,2,3,4,5
		}
	if(str.length()<=kompresStr.length()){
		return str;
	}
	else
		return kompresStr;
		}
	
public static void main(String[] args) {
	String mojString=new String("Nermin");
	String kompString=kompresuj(mojString);
	System.out.println(kompString);
	String mojString2=new String("Nneeermiiiin");
	String kompString2=kompresuj(mojString2);
	System.out.println(kompString2);
	String mojString3=new String("Nneeermiiiin jjje veessseoooo");
	String kompString3=kompresuj(mojString3);
	System.out.println(kompString3);
}
}
