package zadaca;

public class zadatak16 {

	public static void napravi2Niza(int[] niz){
		int brP=0,brS=0;
		for(int i=0;i<niz.length;i++){
			if(prostBroj(niz[i]))
				brP++;
			else brS++;
		}
		int[] nizS=new int[brS];
		int[] nizP=new int[brP];
		
		for(int i=0;i<niz.length;i++){
			if(prostBroj(niz[i])){
			nizP[i]=niz[i];	
			}
			else
				nizS[i]=niz[i];
			}
		
	}
	public static boolean prostBroj(int n){
		boolean prost=true;
		for(int i=2;i<n-1;i++){
			if(n%i==0) {
				prost=false;
			}
		}
		return prost;
	}
	
public static void main(String[] args) {
	
}
}
