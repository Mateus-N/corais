package menus;

import java.util.Scanner;

public class MenuSair {
    public static boolean showText() {
        Scanner input = new Scanner(System.in);

        System.out.println("\nDeseja mesmo sair?\n1 - Sim / 2 - Não");
        int opcao = input.nextInt();

        if (opcao == 1) {
            return true;
        } else if (opcao == 2) {
            return false;
        } else {
            System.out.println("Comando desconhecido.");
            return false;
        }
    }
}
