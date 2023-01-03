package com.mycompany.lista.ligada;

public class App {

    public static void main(String[] args) {

        ListaLigada<Integer> Numeros = new ListaLigada<Integer>();

        System.out.println(Numeros.getTamanho());
        
        Numeros.adicionar(1);
        Numeros.adicionar(2);
        Numeros.adicionar(3);
        Numeros.adicionar(4);
        Numeros.adicionar(5);
        
        System.out.println("Lista de Numeros: ");
        System.out.println("Tamanho: " + Numeros.getTamanho());
        System.out.println("Primeiro elemento: " + Numeros.getPrimeiro().getValor());
        System.out.println("Ultimo elemento: " + Numeros.getUltimo().getValor());
        for (int i = 0; i < Numeros.getTamanho(); i++) {
            System.out.println(Numeros.get(i).getValor());
        }
        System.out.println();
        System.out.println("Lista de Clientes:");
        ListaLigada<Cliente> listaClientes = new ListaLigada<Cliente>();
        listaClientes.adicionar(new Cliente("123", "Viny"));
        listaClientes.adicionar(new Cliente("853", "Cleber"));
        listaClientes.adicionar(new Cliente("439", "Mauro"));
        
        for (int i = 0; i < listaClientes.getTamanho(); i++) {
            System.out.println(listaClientes.get(i).getValor());
        }
    }

}
