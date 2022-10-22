import java.util.Random;

public class Main {
	static int[] insertionSort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
  
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        
        return arr;
    }
	
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.println(i + ": " + arr[i] + " ");
  
        System.out.println();
    }
    
	public static void main(String[] args) {
		int[] array500 = new int[500];
		
    	Random objGenerator = new Random();
    	
        for (int i = 0; i < 500; i++){
        	int randomNumber = objGenerator.nextInt(10000 - 1 + 1) + 1;
        	array500[i] = randomNumber;
         }
        
        int[] soArray500 = insertionSort(array500);
        
        printArray(soArray500);
        
        int posElementoSorteado = objGenerator.nextInt(500);
        
        int elementoEscolhido = soArray500[posElementoSorteado];
        
        System.out.println("Elemento sorteado: " + elementoEscolhido);
        
        
        long startBuscaBinaria = System.nanoTime();
        
        Integer posicao = BuscaBinaria.binaria(elementoEscolhido, soArray500);
        
        long fimBuscaBinaria = System.nanoTime();
        
        long totalBuscaBinaria = fimBuscaBinaria - startBuscaBinaria;
        

        
        
        long startBuscaSequencial = System.nanoTime();
        
        int quantidadeElementos = BuscaSequencial.linear(elementoEscolhido, soArray500);
        
        long fimBuscaSequencial = System.nanoTime();
        
        long totalBuscaSequencial = fimBuscaSequencial  - startBuscaSequencial;
        
        
        
        long tempoTotalBuscas = fimBuscaSequencial - startBuscaBinaria;
        
        long percentBuscaBinaria = (totalBuscaBinaria * 100) / tempoTotalBuscas;
        
        long percentBuscaSequencial = (totalBuscaSequencial * 100) / tempoTotalBuscas;
        
        System.out.println("Posição elemento sorteado: " + posicao);

        System.out.println("Quantidade de elementos iguais a " + elementoEscolhido + " é de: " + quantidadeElementos);
        
        System.out.println("Tempo total buscas em nano secundos: " + tempoTotalBuscas);
        
        System.out.println("Tempo total busca binária em nano secundos: " + totalBuscaBinaria + " (" + percentBuscaBinaria + "%)");
        
        System.out.println("Tempo total busca sequencial em nano secundos: " + totalBuscaSequencial + " (" + percentBuscaSequencial + "%)");
        
        /*
         * Com 500 elementos o percentual da busca binária é entre 60-70% equanto o da busca sequencial é entre 30-40% do tempo total das buscas.
         */
        
        
	}
}
