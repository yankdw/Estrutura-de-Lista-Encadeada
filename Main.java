import java.util.Scanner; // Importa o Scanner para ler do teclado

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Cria o objeto Scanner
        Pilha pilha = new Pilha(); // Cria uma pilha
        Fila filaA = new Fila();   // Cria fila A
        Fila filaB = new Fila();   // Cria fila B

        int opcao = -1; // Controla o menu

        // Menu principal
        while (opcao != 0) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Inserir na pilha");
            System.out.println("2 - Remover da pilha");
            System.out.println("3 - Imprimir pilha");

            System.out.println("4 - Inserir na fila A");
            System.out.println("5 - Inserir na fila B");
            System.out.println("6 - Remover da fila A");
            System.out.println("7 - Remover da fila B");
            System.out.println("8 - Imprimir fila A");
            System.out.println("9 - Imprimir fila B");

            System.out.println("10 - Merge de A e B");
            System.out.println("0 - Sair");

            System.out.print("Escolha: ");
            opcao = entrada.nextInt(); // Lê a opção

            if (opcao == 1) {
                System.out.print("Digite um número para empilhar: ");
                int num = entrada.nextInt();
                pilha.insere(num);

            } else if (opcao == 2) {
                pilha.remove();

            } else if (opcao == 3) {
                pilha.imprime();

            } else if (opcao == 4) {
                System.out.print("Digite um número para inserir na fila A: ");
                int num = entrada.nextInt();
                filaA.insere(num);

            } else if (opcao == 5) {
                System.out.print("Digite um número para inserir na fila B: ");
                int num = entrada.nextInt();
                filaB.insere(num);

            } else if (opcao == 6) {
                filaA.remove();

            } else if (opcao == 7) {
                filaB.remove();

            } else if (opcao == 8) {
                filaA.imprime();

            } else if (opcao == 9) {
                filaB.imprime();

            } else if (opcao == 10) {
                System.out.println("Fazendo o merge das filas A e B:");
                Fila filaC = Merge.junta(filaA, filaB);
                filaC.imprime(); // Imprime a fila C (ordenada)
            }

        }

        System.out.println("Fim.");
        entrada.close(); // Fecha o scanner
    }
}
