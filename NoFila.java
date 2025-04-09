// Nó da fila
class NoFila {
    int valor;           // Guarda o número
    NoFila proximo;      // Aponta para o próximo nó
}

// Estrutura da fila
class Fila {
    NoFila inicio;       // Aponta para o primeiro da fila
    NoFila fim;          // Aponta para o último da fila

    // Insere um valor no final da fila
    void insere(int numero) {
        NoFila novo = new NoFila(); // Cria novo nó
        novo.valor = numero;        // Coloca o valor
        novo.proximo = null;        // Ele será o último

        if (inicio == null) {       // Se a fila está vazia
            inicio = novo;          // Início aponta pro novo
            fim = novo;             // Fim também aponta pro novo
        } else {
            fim.proximo = novo;     // O fim atual aponta pro novo
            fim = novo;             // Novo passa a ser o fim
        }
    }

    // Remove o primeiro valor da fila
    void remove() {
        if (inicio == null) {                    // Fila vazia
            System.out.println("Fila vazia");    // Mensagem de erro
        } else {
            System.out.println("Removido: " + inicio.valor); // Mostra o valor removido
            inicio = inicio.proximo;            // Início passa pro próximo

            if (inicio == null) {               // Se ficou vazia
                fim = null;                     // Fim também fica vazio
            }
        }
    }

    // Mostra todos os valores da fila
    void imprime() {
        NoFila temp = inicio;           // Começa do início
        System.out.print("Fila: ");
        while (temp != null) {          // Enquanto tiver elementos
            System.out.print(temp.valor + " "); // Mostra valor
            temp = temp.proximo;        // Vai para o próximo
        }
        System.out.println();           // Pula linha no fim
    }
}
