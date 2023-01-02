package com.mycompany.lista.ligada;

public class App {

    public static void main(String[] args) {

        ListaLigada lista = new ListaLigada();

        System.out.println(lista.getTamanho());
        lista.adicionar("AC");
        lista.adicionar("BA");
        lista.adicionar("CE");
        lista.adicionar("DF");
        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println("Primeiro elemento: " + lista.getPrimeiro().getValor());
        System.out.println("Ultimo elemento: " + lista.getUltimo().getValor());
        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(lista.get(i).getValor());
        }

        //removendo estado CE
        System.out.println("Após essa linha estou removendo estado CE");
        lista.remover("AC");
        //removendo estado DF
        System.out.println("Após essa linha estou removendo estado DF");
        lista.remover("DF");
        //adicioanando estado CE
        System.out.println("Após essa linha estou removendo estado CE");
        lista.adicionar("SP");
        lista.remover("BA");
        lista.remover("CE");
        lista.remover("AC");
        lista.remover("SP");

        System.out.println("Tamanho da lista: " + lista.getTamanho());
        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(lista.get(i).getValor());
        }
    }

}
