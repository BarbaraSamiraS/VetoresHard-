import java.util.Scanner;

public class Palindromo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM=10;
		int vetorA[], i, n,r=0, p;
		vetorA = new int[TAM];
		
		p=TAM-1;

		for(i=0; i<TAM; i++) { 
			System.out.println("Digite o "+(i+1)+" valor do vetor A"); 
			vetorA[i]= ler.nextInt();

		}
		
		for(n=0; n<5; n++) {
			if(vetorA[n]==vetorA[p]) {
				p--;
				r++;
			}
		}
		if(r==5) {
			System.out.println("Este é um número palindromo");
		} else {
			System.out.println("Este não é um número palindromo");
		}
		
		
		ler.close();

	}

}

