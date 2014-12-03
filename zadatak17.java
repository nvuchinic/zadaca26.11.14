package zadaca;

public class zadatak17 {
	
	public static String kompresuj(String str){
		str=str.toLowerCase();
		String trenutniStr=new String();
		trenutniStr="";
		String kompresStr=new String();
		kompresStr="";
		int i=0,brC=1;
		boolean kraj=false;
		while(i<str.length()){
			trenutniStr="";
			trenutniStr+=str.charAt(i);
			if(i==str.length()-1){
				kompresStr+=str.charAt(i);
				//kraj=true;
				break;	
				}
			brC=1;
			while(str.charAt(i)==str.charAt(i+1)){
				brC++;
				i++;
				trenutniStr+=str.charAt(i);
			}
			if(brC>1){
				trenutniStr=str.charAt(i)+Integer.toString(brC);
				System.out.println("trenutni string: "+trenutniStr);
			}
			kompresStr+=trenutniStr;						//n e r m i
			System.out.println(kompresStr);
			i++;											//1,2,3,4,5
		}
	
		return kompresStr;
		}
	
public static void main(String[] args) {
	String mojString=new String("Nneeermiiiin");
	String kompString=kompresuj(mojString);
	System.out.println(kompString);
}
}
