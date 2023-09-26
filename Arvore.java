
package com.mycompany.mavenproject1;
// Joao Pedro Aires de Siqueira
public class Arvore {
    private Node raiz;

    public Arvore() {
        this.raiz = null;
    }

    public Node getRaiz() {
        return this.raiz;
    }

    public void setRaiz(Node raiz) {
        this.raiz = raiz;
    }

    public void inserir(int dado) {
        raiz = adicionarRecursivamente(raiz, dado);
    }

    private Node adicionarRecursivamente(Node atual, int valor) {
        if (atual == null) {
            return new Node(valor);
        }

        if (valor < atual.getValor()) {
            atual.setEsquerda(adicionarRecursivamente(atual.getEsquerda(), valor));
        } else if (valor > atual.getValor()) {
            atual.setDireita(adicionarRecursivamente(atual.getDireita(), valor));
        }

        return atual;
    }

    public void exibirPreOrdem() {
        percorrerPreOrdem(raiz);
    }

    private void percorrerPreOrdem(Node node) {
        if (node != null) {
            System.out.print(node.getValor() + " ");
            percorrerPreOrdem(node.getEsquerda());
            percorrerPreOrdem(node.getDireita());
        }
    }

    public void exibirPosOrdem() {
        percorrerPosOrdem(raiz);
    }

    private void percorrerPosOrdem(Node node) {
        if (node != null) {
            percorrerPosOrdem(node.getEsquerda());
            percorrerPosOrdem(node.getDireita());
            System.out.print(node.getValor() + " ");
        }
    }

    public void exibirEmOrdem() {
        percorrerEmOrdem(raiz);
    }

    private void percorrerEmOrdem(Node node) {
        if (node != null) {
            percorrerEmOrdem(node.getEsquerda());
            System.out.print(node.getValor() + " ");
            percorrerEmOrdem(node.getDireita());
        }
    }

    public void deletarMaior() {
        raiz = removerMaiorRecursivo(raiz);
    }

    private Node removerMaiorRecursivo(Node atual) {
        if (atual == null || atual.getDireita() == null) {
            return atual.getEsquerda();
        }
        atual.setDireita(removerMaiorRecursivo(atual.getDireita()));
        return atual;
    }

    public void deletarMenor() {
        raiz = removerMenorRecursivo(raiz);
    }

    private Node removerMenorRecursivo(Node atual) {
        if (atual == null || atual.getEsquerda() == null) {
            return atual.getDireita();
        }
        atual.setEsquerda(removerMenorRecursivo(atual.getEsquerda()));
        return atual;
    }

    public Node encontrarMenor(Node raiz) {
        return raiz.getEsquerda() == null ? raiz : encontrarMenor(raiz.getEsquerda());
    }

    public void remover(int valor) {
        raiz = removerRecursivo(raiz, valor);
    }

    private Node removerRecursivo(Node atual, int valor) {
        if (atual == null) {
            return null;
        }

        if (valor == atual.getValor()) {
            if (atual.getEsquerda() == null && atual.getDireita() == null) {
                return null;
            }
            if (atual.getDireita() == null) {
                return atual.getEsquerda();
            }
            if (atual.getEsquerda() == null) {
                return atual.getDireita();
            }

            int menorValor = encontrarMenor(atual.getDireita()).getValor();
            atual.setValor(menorValor);
            atual.setDireita(removerRecursivo(atual.getDireita(), menorValor));
            return atual;
        }
        if (valor < atual.getValor()) {
            atual.setEsquerda(removerRecursivo(atual.getEsquerda(), valor));
            return atual;
        }

        atual.setDireita(removerRecursivo(atual.getDireita(), valor));
        return atual;
    }
}
