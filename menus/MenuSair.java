package menus;

import java.util.Scanner;

public class MenuSair {
    private static Scanner in = new Scanner(System.in);
    
    public static boolean showText() {
        System.out.println("\nDeseja mesmo sair?\n1 - Sim / 2 - Não");
        int opcao = Integer.parseInt(in.nextLine());

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
