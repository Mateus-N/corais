package menus;

import java.util.Scanner;

public class MenuSair {
    private static Scanner in = new Scanner(System.in);
    
    public static boolean showText() {
        while (true) {
            System.out.println("\nDeseja mesmo sair?\n1 - Sim / 2 - Não");
            try {
                int opcao = Integer.parseInt(in.nextLine());

                if (opcao == 1) {
                    return true;
                } else if (opcao == 2) {
                    return false;
                } else {
                    System.out.println("Comando desconhecido.");
                }
            } catch (Exception e) {
                System.out.println("Comando desconhecido.");
            }
        }
    }
}
