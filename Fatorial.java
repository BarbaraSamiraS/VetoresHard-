
import java.util.Scanner;
public class Fatorial {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM=15;
		int vetorA[], vetorB[], n=1, i;
		vetorA = new int[TAM];
		vetorB = new int[TAM];
		

		for(i=0; i<TAM; i++) { 
			System.out.println("Digite o "+(i+1)+" vAlor do vetor A"); 
			vetorA[i]= ler.nextInt();
		}
		
		for(i=0; i<TAM; i++) { 
			while(vetorA[i]>=1) { 
				n=vetorA[i]*n;
				vetorA[i]--;
			}
			vetorB[i]=n;
			n=1;
		}
		
		
		System.out.print("\nB = ");
		System.out.print(" [ ");
		for(i=0; i<TAM; i++) { 
			if (i<(TAM-1)) {
				System.out.print(vetorB[i]+", ");
			}else {
				System.out.print(vetorB[i]+" ");
			}
		}
		System.out.print(" ]");
		
		ler.close();

	}

}
