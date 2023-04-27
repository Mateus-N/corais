package menus;

import java.util.Scanner;

import data.DataUsers;
import models.Hobbie;
import models.Usuario;
import utils.UtilitariosHobbies;

// classe para listar e editar hobbies
public class ListarHobbies {
    private static Scanner in = new Scanner(System.in);

    public static void showMenu(Usuario user) {
        // exibe todos os hobbies do usuario na tela
        System.out.println("\nSeus hobbies:");
        DataUsers.userHobbies(user);

        // Verifica se deseja editar a lista
        boolean editarListaHobbies = MenuDuasOpcoes
            .pergunta("Deseja incluir ou remover algum hobbie?");

        if (editarListaHobbies) {
            // verifica se deseja adicionar ou remover hobbies da lista
            String adicionarOuRemover = MenuDuasOpcoes
                .perguntaComOpcoes("Adicionar ou remover Hobbie?", "Adicionar", "Remover");
      
            // adiciona hobbies
            if (adicionarOuRemover.equals("Adicionar")) {
                UtilitariosHobbies.escolherHobbies(user);
                // recursividade para exibir esse menu novamente
                showMenu(user);
            // remove hobbies
            } else if (adicionarOuRemover.equals("Remover")) {
                removerHobbie(user);
                // recursividade para exibir esse menu novamente
                showMenu(user);
            }
        }
    }

    // logica para remover hobbies
    private static void removerHobbie(Usuario user) {
        System.out.print("Qual hobbie deseja remover: ");
        String hobbieARemover = in.nextLine();

        for (Hobbie hobbie : user.getHobbies()) {
            if (hobbie.getNome().toLowerCase().equals(hobbieARemover.toLowerCase())) {
                user.getHobbies().remove(hobbie);
                break;
            }
        }
    }
}
