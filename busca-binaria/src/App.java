
import java.util.Scanner;


public class App {

    
    public static void main(String[] args) {
        int[] vetor = new int[8];
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * 2;
            System.out.println(vetor[i]);
        }
        
        int numBuscado;
        System.out.println("Qual numero voce quer buscar?");
        Scanner sc = new Scanner(System.in);
        numBuscado = sc.nextInt();
        
        boolean heExists = false;
        
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;
        
        while (inicio<=fim) {            
            meio = (int) ((inicio + fim)/2);
            if (vetor[meio] == numBuscado) {
                heExists = true;
            }
            else if(vetor[meio]<numBuscado){
                inicio = meio + 1;
            }
            else{// só pode ser maior
                fim = meio - 1;
            }
        }
        
        if (heExists) {
            System.out.println("Achei seu numero na lista!");
        }else{
            System.out.println("numero não encontrado..");
        }
        
    }
    
}
