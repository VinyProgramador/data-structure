
public class App {

    public static void main(String[] args) {
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 100);
        }
        
        System.out.println("Desordenado:");;;
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        int aux, j;
        for (int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;
            while (j >= 0 && vetor[j] > aux ) {                
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j + 1] = aux;
        }
        
        System.out.println("\nOrdenado com Insertion Sort:");;;
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

}
