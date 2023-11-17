import java.util.Scanner;
public class ParesImpares {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM=20;
		int vetorA[], vetorB[], i, p=0, r, t;
		vetorA = new int[TAM]; 
		vetorB = new int[TAM];
		
		t=TAM-1;

		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor A"); 
			vetorA[i]= ler.nextInt();
			
			if (vetorA[i] % 2 == 0) {
				vetorB[p] = vetorA[i];
				p++;
					
			}else {	
				vetorB[t] = vetorA[i];
				t--;
			}
		}
		
		System.out.print("\nB = ");
		System.out.print(" [ ");
		for(r=0; r<TAM; r++) { 
			if (r<(TAM-1)) {
				System.out.print(vetorB[r]+", ");
			}else {
				System.out.print(vetorB[r]+" ");
			}
		}
		System.out.print(" ]");
		
		ler.close();
	}

}
