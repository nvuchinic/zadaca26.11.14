package zadaca;

public class zadatak14 {
	/**
	 * funkcija koja prima dva niza koja predstavljaju binarnu reprezentaciju nekog broja,
	 * zatim vrsi binarno sabiranje elemenata niza, i trecem nizu pridruzuje zbir
	 * @param n1 niz cijelih brojeva
	 * @param n2 niz cijelih brojeva
	 * @return niz cijelih brojeva(binarna reprezentacija zbira)
	 */
	public static int[] saberiBinarne(int[] n1, int[] n2){
		int[] binarniZbir=new int[8];
		int i=7;
		//while(i>=0){							//{1, 0, 0, 0, 0, 0, 1, 0}
		do{
		if(n1[i]==1&&n2[i]==1){					//{0, 0, 0, 0, 0, 0, 1, 1}
				if(i!=7){						// 1, 0, 0, 0, 0, 1, 0, 1
					if(n1[i+1]==1&&n2[i+1]==1){
						binarniZbir[i]=1;
						//System.out.println(binarniZbir[i]);
						}
					else{binarniZbir[i]=0;
						}
				}
				else{binarniZbir[i]=0;
				//System.out.println(binarniZbir[i]);
				}
				}
			
			else if((n1[i]==0)&&(n2[i]==0)){
				if(i!=7){
					if((n1[i+1]==1)&&(n2[i+1]==1)){
						binarniZbir[i]=1;
						}
					else{binarniZbir[i]=0;}
						//System.out.println(binarniZbir[i]);}
				}
				else{binarniZbir[i]=0;
				//System.out.println(binarniZbir[i]);
				}
				
}
			else if((n1[i]==1)||(n2[i]==1)){//||(n1[1]==1)&&(n2[i]==0)){
				if(i!=7){
					if(n1[i+1]==1&&n2[i+1]==1){
						binarniZbir[i]=0;
						System.out.println(binarniZbir[i]);
						}
					else{
						binarniZbir[i]=1;
						}
					}
				else{
					binarniZbir[i]=1;
				System.out.println(binarniZbir[i]);}
					}
			--i;
		} while(i>=0);
		return binarniZbir;
	}
	
public static void main(String[] args) {
int[] niz1=new int[]{0, 0, 0, 0, 0, 0, 1, 0};
int[] niz2=new int[]{1, 0, 0, 0, 0, 0, 1, 1};
int[] niz3=new int[8];
niz3=(saberiBinarne(niz1, niz2));
for(int i=0;i<8;i++){
	System.out.print(niz3[i]+", ");
}

}
}
