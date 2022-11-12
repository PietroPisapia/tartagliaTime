import java.util.Scanner;
public class Tartaglia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Quante righe vuoi stampare? ");
		int righe=scanner.nextInt();
		int numero = 1;
		
		for(int i=0;i<righe;i++) {
			
			for(int s=0;s<righe-i;s++) {
				System.out.print(" ");
			}
			numero=1;
			for(int k=0;k<=i;k++) {
				System.out.print(numero+" ");
				
				numero=numero*(i-k)/(k+1);
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
