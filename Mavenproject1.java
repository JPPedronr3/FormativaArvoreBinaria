package com.mycompany.mavenproject1;
// Joao Pedro Aires de Siqueira
public class Mavenproject1 {
    public static void main(String[] args) throws Exception {
        Arvore arvore = new Arvore();
        
        arvore.inserir(5);
        arvore.inserir(3);
        arvore.inserir(2);
        arvore.inserir(1);
        arvore.inserir(6);
        arvore.inserir(7);
        arvore.inserir(4);

        System.out.println("Pos ordem:");
        arvore.exibirPosOrdem();
        System.out.println("\nEm ordem:");
        arvore.exibirEmOrdem();
        System.out.println("\nPre ordem:");
        arvore.exibirPreOrdem();

        arvore.deletarMaior();

        System.out.println("\n\nApos remoção do maior:");
        System.out.println("\nPos ordem:");
        arvore.exibirPosOrdem();
        System.out.println("\nEm ordem:");
        arvore.exibirEmOrdem();
        System.out.println("\nPre ordem:");
        arvore.exibirPreOrdem();

        arvore.deletarMenor();

        System.out.println("\n\nApos remoção do menor:");
        System.out.println("\nPos ordem:");
        arvore.exibirPosOrdem();
        System.out.println("\nEm ordem:");
        arvore.exibirEmOrdem();
        System.out.println("\nPre ordem:");
        arvore.exibirPreOrdem();

        arvore.remover(5);

        System.out.println("\n\nApos remoção do N(5):");
        System.out.println("\nPos ordem:");
        arvore.exibirPosOrdem();
        System.out.println("\nEm ordem:");
        arvore.exibirEmOrdem();
        System.out.println("\nPre ordem:");
        arvore.exibirPreOrdem();
    }
}
