package shell.sort;

public class App {

    public static void main(String[] args) {
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }
        
        System.out.println("Desordernado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        int h = 1;
        int n = vetor.length;

        while (h < n) {
            h = h * 3 + 1;
        }

        h = (int) Math.floor(h / 3);

        int el, j;
        
        while (h > 0) {            
            for (int i = h; i < n; i++) {
                el = vetor[i];
                j = i;
                while (j >= h && vetor[j - h] > el) {                    
                    vetor[j] = vetor[j - h];
                    j = j - h;
                }
                vetor[j] = el;
            }
            h = h /2;
        }
        
        System.out.println("Ordernado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

}
