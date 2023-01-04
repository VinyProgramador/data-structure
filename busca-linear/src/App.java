
import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        int[] vetor = new int[8];
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 10);
            System.out.println(vetor[i]);
        }
        
        System.out.println("Qual numero voce busca?\n");
        Scanner sc = new Scanner(System.in);
        int numBuscado = sc.nextInt();
        
        boolean heExists = false;
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] == numBuscado){
                heExists = true;
                break;
            }
        }
        
        if (heExists) {
            System.out.println("Achei seu numero!");
        }
        else{
            System.out.println("Numero não encontrado..");
        }
    }

}
