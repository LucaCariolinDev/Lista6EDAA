public class BuscaSequencial {
	  public static int linear(int x, int numeros[]) {
		    final int n = numeros.length;
		    int qtdIguais = 0;
		    for (int i = 0; i < n; i++)
		      if (x == numeros[i])
		    	  qtdIguais++;
		    
		    return qtdIguais;
	  }
}
