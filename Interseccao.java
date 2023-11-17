import java.util.Scanner;

public class Interseccao {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM=5;
		int vetorA[],vetorB[],vetorC[], i,r=0,p,n,o=0;
		vetorA = new int[TAM];
		vetorB = new int[TAM];
		vetorC = new int[TAM];

		for(i=0; i<TAM; i++) { 
			System.out.println("Digite o "+(i+1)+"° valor do vetor A"); 
			vetorA[i]= ler.nextInt();

		}
		
		System.out.println("Digite os valores do vetor B"); 

		for(i=0; i<TAM; i++) {
		System.out.println("Digite o "+(i+1)+"° valor do vetor B"); 
		vetorB[i]= ler.nextInt();
		}
		
		for(n=0; n<TAM; n++) {
			for(p=0; p<TAM; p++) {
				if(vetorA[n]==vetorB[p]) {
					vetorC[o]=vetorA[n];
					o++;
					r++;
				}
			}
		}
			
		if (r==0) {
			System.out.println("NÃO é possivel criar a intersecção devido a não possuir valores iguais. ");
		}else {
			System.out.print("\nC = ");
			System.out.print(" [ ");
			for(o=0; o<r; o++) { 
				if (o<(r-1)) {
					System.out.print(vetorC[o]+", ");
				}else {
					System.out.print(vetorC[o]+" ");
				}
			}
			System.out.print(" ]");
		}
		
		
		
		
		ler.close();

	}

}