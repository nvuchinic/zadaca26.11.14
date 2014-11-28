package zadaca;

public class zadatak18 {
	
	public static int[][] tablicaMnozenja(int m, int n){
		int[][] nizTM=new int[m][n];
		
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				nizTM[i][j]=i*j;
			}
			System.out.println();
		}
		return nizTM;
	}
	
public static void main(String[] args) {
	int red=3,kol=5;
	int[][] niz=new int[red][kol];
	niz=tablicaMnozenja(red,kol);
	
	for(int i=1;i<=red;i++){
		for(int j=1;j<=kol;j++){
	System.out.print(niz[red][kol]+"  ");
		}
		System.out.println();
	}
}
}
