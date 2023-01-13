
public class App {

    public static void main(String[] args) {
        int[] vetor = new int[1000];
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }
        
        System.out.println("Desordenado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        
        int posicaoMenor;
        int aux;
        for (int i = 0; i < vetor.length; i++) {
            posicaoMenor = i;
            for (int j = i+1; j < vetor.length; j++) {
                if (vetor[j] < vetor[posicaoMenor]) {
                    posicaoMenor = j;
                }
            }
            aux = vetor[posicaoMenor];
            vetor[posicaoMenor] = vetor[i];
            vetor[i] = aux;
        }
        
        System.out.println("\nOrdenado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
    
}
