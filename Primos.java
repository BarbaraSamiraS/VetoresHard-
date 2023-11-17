import java.util.Scanner;

public class Primos {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM=10;
		int vetorA[], i,r=0,p;
		vetorA = new int[TAM];

		for(i=0; i<TAM; i++) { 
			System.out.println("Digite o "+(i+1)+" valor do vetor A"); 
			vetorA[i]= ler.nextInt();

		}
		
		for(i=0; i<TAM; i++) {
			for(p=1; p<=vetorA[i]; p++) {
				if(vetorA[i]%p==0) {
					r++;
					
				}
			}
			if (r<3) {
				System.out.println(vetorA[i]+"    Este número e primo");
			} else {
				System.out.println(vetorA[i]); 
			}
			r=0;
		}
		
		
		
		ler.close();

	}

}