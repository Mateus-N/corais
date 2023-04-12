package menus;

import data.DataUsers;
import models.Usuario;
import java.util.Scanner;

public class MenuInicial {
    private static Scanner input = new Scanner(System.in);

    public static void showMenu(Usuario user) {
        while (true) {
            // Opções de escolha do usuário
            listarOpcoes();
            try {
                int opcao = Integer.parseInt(input.nextLine());
                if (opcao == 0) {
                    boolean sair = MenuSair.showText();
                    if (sair) {
                        break;
                    }
                } else if (opcao == 1) {
                    Perfil.showMenu(user);
                } else if (opcao == 2) {
                    System.out.println("Notificações:");
                } else if (opcao == 3) {
                    System.out.println("Grupos que você entrou:");
                    DataUsers.listarGrupoPorUsuario(user);
                } else if (opcao == 4) {
                    System.out.println("Seus hobbies:");
                    DataUsers.userHobbies(user);
                } else if (opcao == 5) {
                    System.out.println("Barra de pesquisa:");
                } else if (opcao == 6) {
                    System.out.println("Criação de grupo:");
                    CriarGrupo.showMenu(user);
                } else if (opcao == 7) {
                    System.out.println("Eventos e grupos em destaque:");
                } else {
                    System.out.println("Comando desconhecido.");
                }
            } catch (Exception e) {
                System.out.println("Comando desconhecido.");
            }
        }
    }

    private static void listarOpcoes() {
        System.out.println("\n0 - Sair\n1 - Perfil\n2 - Notificações\n3 - Listar grupos\n" +
            "4 - Listar hobbies\n5 - Buscar eventos e grupos\n6 - Criar grupo\n" +
            "7 - Eventos e grupos em destaque");
    }
}
