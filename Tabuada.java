import java.util.Scanner;
public class Tabuada {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM=5;
		int vetorA[], i, r, p;
		vetorA = new int[TAM]; 

		for(i=0; i<TAM; i++) { 
			System.out.println("Digite o "+(i+1)+" valor do vetor A"); 
			vetorA[i]= ler.nextInt();
		}
		
		for(i=0;i<TAM;i++) {
			System.out.println(" "); 
			for(p=0;p<TAM;p++) {
				r = vetorA[p]*(i+1);
				System.out.println((i+1)+" x "+vetorA[p]+" = "+r);
			}

		}
		ler.close();
	}

}
