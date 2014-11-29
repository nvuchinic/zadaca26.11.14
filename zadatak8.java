/*program koji prima cjeli broj, 
 * a zatim ispisuje karakter ciji je ASCII kod uneseni broj
 */
package zadaca;

import java.util.Scanner;

public class zadatak8 {
public static void main(String[] args) {
	System.out.println("Unesite cijeli broj:");
	Scanner unos=new Scanner(System.in);
	int n=unos.nextInt();
	unos.close();
	char c=(char) n;
	System.out.println("Znak koji ima ASCII sifru "+n+" je znak "+c);
}
}
