// Classe para fazer o merge
class Merge {

    // Junta duas filas ordenadas em uma terceira
    static Fila junta(Fila a, Fila b) {
        Fila c = new Fila(); // Nova fila que vai guardar tudo junto

        NoFila atualA = a.inicio; // Pega o início da fila A
        NoFila atualB = b.inicio; // Pega o início da fila B

        // Compara elementos enquanto os dois ainda tiverem
        while (atualA != null && atualB != null) {
            if (atualA.valor < atualB.valor) {
                c.insere(atualA.valor);      // Insere menor valor
                atualA = atualA.proximo;     // Vai pro próximo de A
            } else {
                c.insere(atualB.valor);      // Insere menor valor
                atualB = atualB.proximo;     // Vai pro próximo de B
            }
        }

        // Se ainda sobrou na fila A, insere tudo
        while (atualA != null) {
            c.insere(atualA.valor);
            atualA = atualA.proximo;
        }

        // Se ainda sobrou na fila B, insere tudo
        while (atualB != null) {
            c.insere(atualB.valor);
            atualB = atualB.proximo;
        }

        return c; // Retorna a fila unida e ordenada
    }
}
