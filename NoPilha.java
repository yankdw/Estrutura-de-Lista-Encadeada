// Nó da pilha
class NoPilha {
    int valor;           // Armazena o número
    NoPilha proximo;     // Aponta para o próximo nó
}

// Estrutura de pilha com operações básicas
class Pilha {
    NoPilha topo;        // Aponta para o topo da pilha

    // Insere um valor na pilha
    void insere(int numero) {
        NoPilha novo = new NoPilha(); // Cria novo nó
        novo.valor = numero;          // Guarda o número no nó
        novo.proximo = topo;          // O novo nó aponta pro topo antigo
        topo = novo;                  // Agora o novo é o topo
    }

    // Remove o valor do topo da pilha
    void remove() {
        if (topo == null) {                        // Se não tem nada
            System.out.println("Pilha vazia");     // Mostra erro
        } else {
            System.out.println("Removido: " + topo.valor); // Mostra o valor removido
            topo = topo.proximo;                   // Aponta o topo para o próximo
        }
    }

    // Mostra os valores da pilha
    void imprime() {
        NoPilha temp = topo;           // Começa do topo
        System.out.print("Pilha: ");
        while (temp != null) {         // Enquanto tiver elementos
            System.out.print(temp.valor + " "); // Mostra o valor
            temp = temp.proximo;       // Vai pro próximo nó
        }
        System.out.println();          // Pula linha no fim
    }
}
