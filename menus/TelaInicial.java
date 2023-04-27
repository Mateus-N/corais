package menus;

import java.util.Scanner;

// menu mostrado ao ser iniciado o programa
public class TelaInicial {
    private static Scanner in = new Scanner(System.in);

    public static void showMenu() {
        boolean continuar = true;

        // Exibe opcoes do menu
        System.out.println("\n1 - Fazer login\n2 - Criar conta\n3 - Encerrar sistema");
        // valida se foi digitado um numero
        try {
            int opcao = Integer.parseInt(in.nextLine());

            // caso 1 executa o menu de login
            if (opcao == 1) {
                Login.showMenu();
            // caso 2 executa o menu de cadastro
            } else if (opcao == 2) {
                Cadastro.showMenu();
            // caso 3 encerra o programa
            } else if (opcao == 3) {
                System.out.println("\nVolte sempre!");
                continuar = false;
            // caso outro numero
            } else {
                System.out.println("\nEscolha uma opção válida");
            }
        // caso nao digite um numero
        } catch (Exception e) {
            System.out.println("\nEscolha uma opção válida");
        }

        // caso continuar for true
        if (continuar) {
            // recursividade para executar esse menu novamente
            showMenu();
        }
    }
}
