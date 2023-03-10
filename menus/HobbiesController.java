package menus;

import data.DataUsers;
import models.Hobbie;

import java.util.Scanner;

public class HobbiesController {
    private static Scanner input = new Scanner(System.in);

    public static void showMenu() {
        while (true) {
            System.out.println("1 - Criar um Hobbie\n2 - Listar Hobbies");
            int opcao = Integer.parseInt(input.nextLine());

            if (opcao == 1) {
                System.out.println("Nome do Hobbie: ");
                String nomeHobby = input.nextLine();
                Hobbie Hobby = new Hobbie(nomeHobby);
                DataUsers.addHobby(Hobby);

                System.out.println("Hobbie criado.");
            } else if (opcao == 2) {
                System.out.println("Hobbies que você entrou:");
                DataUsers.listarHobbies();
            } else {
                System.out.println("Comando não encontrado.");
            }
        }
    }
}
