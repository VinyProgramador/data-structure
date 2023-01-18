
public class App {

    public static void main(String[] args) {
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        System.out.println("Desordenado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        int n = vetor.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            toApplyHeap(vetor, n, i);
        }

        System.out.println("\nQuase ordenado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        for (int k = n - 1; k > 0; k--) {
            int aux = vetor[0];
            vetor[0] = k;
            vetor[k] = aux;
            
            toApplyHeap(vetor, k, 0);
        }

        System.out.println("\nOrdenado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    private static void toApplyHeap(int[] vetor, int n, int i) {
        int raiz = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;

        if (esquerda < n && vetor[esquerda] > vetor[raiz]) {
            raiz = esquerda;
        }

        if (direita < n && vetor[direita] > vetor[raiz]) {
            raiz = direita;
        }
        if (raiz != i) {
            int aux = vetor[i];
            vetor[i] = vetor[raiz];
            vetor[raiz] = aux;

            toApplyHeap(vetor, n, raiz);
        }
    }
}
