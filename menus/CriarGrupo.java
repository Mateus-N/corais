package menus;

import data.DataUsers;
import models.Grupo;
import models.Hobbie;
import models.Usuario;
import java.util.Scanner;

public class CriarGrupo {
    private static Scanner in = new Scanner(System.in);

    public static void showMenu(Usuario user) {
        System.out.println("Criando novo grupo!");
        Hobbie hobbie = null;
        boolean continuar = true;
        while (continuar) {
            DataUsers.listarHobbies();
            System.out.print("\nQual o hobbie a qual o grupo pertence? ");
            String hobbieEscolhido = in.nextLine();
            hobbie = DataUsers.buscarHobbie(hobbieEscolhido);

            if (hobbie != null) {
                continuar = false;
            } else {
                System.out.println("\nHobbie inexistente! Escolha um Hobbie válido");
            }
        }

        System.out.print("\nNome do grupo: ");
        String nome = in.nextLine();

        System.out.print("\nCidade: ");
        String cidade = in.nextLine();

        System.out.print("\nDescrição do grupo: ");
        String descricao = in.nextLine();

        Grupo grupo = new Grupo(nome, descricao, cidade, user, hobbie);

        int grupoId = DataUsers.addGrupo(grupo);
        user.adicionarGrupo(grupoId);

        System.out.println("\nGrupo adicionado com sucesso!");
    }
}
