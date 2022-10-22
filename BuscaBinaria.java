public class BuscaBinaria {
  public static Integer binaria(int x, int numeros[]) {
    int inicio = 0, fim = numeros.length - 1;
    int meio;
    while (inicio <= fim) {
      meio = (inicio + fim) / 2;
      if (x == numeros[meio])
        return meio;
      if (x < numeros[meio])
        fim = meio - 1;
      else
        inicio = meio + 1;
    }
    return null;
  }
}