package com.mycompany.fila;

public class App {
        public static void main(String[] args) {
        Fila fila = new Fila();
        
        fila.adicionar("Viny");
        fila.adicionar("Mauricio");
        fila.adicionar("Endryl");
        fila.adicionar("Giovana");
        
        System.out.println(fila.get()+ ", este é o primeiro da fila");
        fila.remover();
        System.out.println(fila.get()+ ", este é o primeiro da fila");
    }
}
