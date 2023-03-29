package menus;

import data.DataUsers;
import models.Hobbie;
import models.Usuario;
import java.util.Scanner;

public class CriarGrupo {
    private static Scanner in = new Scanner(System.in);

    public static void showMenu(Usuario user) {
        System.out.println("Criando novo grupo!");

        System.out.println("\nQual o hobbie a qual o grupo pertence?");
        DataUsers.listarHobbies();
        String hobbieEscolhido = in.nextLine();
        Hobbie hobbie = DataUsers.buscarHobbie(hobbieEscolhido);

        System.out.println("Nome do grupo: ");
        String nome = in.nextLine();
    }
}
