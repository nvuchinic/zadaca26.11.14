package zadaca;

public class zadatak15 {
	/**
	 * funkcija koja prima niz(sastavljen od 0 i 1) i 
	 * mjenja mu elemente tako da 0 postaje 1 i obratno
	 * @param niz neki niz sastavljen od 0 i 1
	 * @return niz
	 */
	public static int[] napraviPrviKomplement(int[] niz){
		int[] komplementI=new int[8];
		for(int i=0;i<8;i++){
			komplementI[i]=(niz[i]-1)*-1;
		//	System.out.println(komplementI[i]);
		}
		return komplementI;
		
	}
	/**
	 * funkcija koja prima dva niza koja predstavljaju binarnu reprezentaciju nekog broja,
	 * zatim vrsi binarno sabiranje elemenata niza, i trecem nizu pridruzuje zbir
	 * @param n1 niz cijelih brojeva
	 * @param n2 niz cijelih brojeva
	 * @return niz cijelih brojeva(binarna reprezentacija zbira)
	 */
	public static int[] saberiBinarne(int[] n1, int[] n2){
		boolean imaPrenosa1=false;  //varijabla koja nam govori da li se prenosi 1 kod sabiranja 
		int[] binarniZbir=new int[8];
		int i=7;
		do{
		if(n1[i]==1&&n2[i]==1){		
				if(i!=7){										//00001111
					if(imaPrenosa1==true){						//00100111
						binarniZbir[i]=1;
						imaPrenosa1=true;
						//System.out.println(binarniZbir[i]);
						}
					else{binarniZbir[i]=0;
					imaPrenosa1=true;
						}
				}
				else{binarniZbir[i]=0;
				imaPrenosa1=true;
				//System.out.println(binarniZbir[i]);
				}
				}
			
			else if((n1[i]==0)&&(n2[i]==0)){
				if(i!=7){
					if(imaPrenosa1==true){
						binarniZbir[i]=1;
						imaPrenosa1=false;
						}
					else{binarniZbir[i]=0;
					imaPrenosa1=false;
					}
						//System.out.println(binarniZbir[i]);}
				}
				else{binarniZbir[i]=0;									//00001111
				imaPrenosa1=false;										//10101111
				//System.out.println(binarniZbir[i]);
				}
				
}
			else if((n1[i]==0)&&(n2[i]==1)||(n1[i]==1)&&(n2[i]==0)){
				if(i!=7){
					if(imaPrenosa1==true){
						binarniZbir[i]=0;
						imaPrenosa1=true;
					//	System.out.println(binarniZbir[i]);
						}
					else{
						binarniZbir[i]=1;
						imaPrenosa1=false;
						}
					}
				else{
					binarniZbir[i]=1;
					imaPrenosa1=false;
				//System.out.println(binarniZbir[i]);
					}
					}
			--i;
		} while(i>=0);
		return binarniZbir;
	}
	/**
	 * funkcija prima dva niza(po 8 elementata, 0 i 1), a vraca razliku u smislu binarnog oduzimanja.
	 * Binarno oduzimanje sam implementirao preko metode dvojnog komplementa
	 * @param n1 niz1
	 * @param n2 niz2
	 * @return vraca niz od 8 elemenata(0 i 1)
	 */
	public static int[] oduzmiBinarne(int [] n1, int[] n2){
		int[] razlika=new int[8];
		int[] prviKomplement=new int[8];
		prviKomplement=napraviPrviKomplement(n2);
		System.out.print("prvi komplement\n");
		for(int i=0;i<8;i++)
			System.out.print(prviKomplement[i]);
		System.out.println();
		int[] pomocniNiz=new int[]{0,0,0,0,0,0,0,1};
		System.out.println("00000001");
		int[] drugiKomplement=new int[8];
		drugiKomplement=saberiBinarne(prviKomplement, pomocniNiz);
		//pomjeriLijevo(drugiKomplement);
		System.out.println("drugi komplement");
		for(int i=0;i<8;i++)
			System.out.print(drugiKomplement[i]);
		razlika=saberiBinarne(n1, drugiKomplement);
		return razlika;
	}
	
		/*public static void pomjeriLijevo(int[] niz){
			for(int i=0;i<niz.length-1;i++)
				niz[i]=niz[i+1];
			niz[niz.length-1]=0;
			System.out.println("\n\nNiz pomjeren ulijevo:");
		}*/
	
public static void main(String[] args) {
	int[] mojNiz= new int[]{1,0,1,0,1,0,1,0};					//11011110
	int[] mojNiz2=new int[]{1,1,0,0,1,1,0,0,};
	int[] razlika=new int[8];
	
	razlika=oduzmiBinarne(mojNiz, mojNiz2);
	System.out.println();
	for(int i=0;i<8;i++){
		System.out.print(mojNiz[i]);
	}
	System.out.println();
	for(int i=0;i<8;i++){
	System.out.print(razlika[i]);
}

	
	
	
	
}
}
