package menus;

import data.DataUsers;
import models.Hobbies;

import java.util.Scanner;

public class Inicio {
    private static Scanner input = new Scanner(System.in);

    public static void showMenu() {
        System.out.println("1 - Criar um grupo");
        int opcao = Integer.parseInt(input.nextLine());

        if (opcao == 1) {
            System.out.println("Nome do grupo: ");
            String nomeHobby = input.nextLine();
            Hobbies Hobby = new Hobbies(nomeHobby);
            DataUsers.addHobby(Hobby);

            System.out.println("Grupo criado.");
        } else {
            System.out.println("Comando não encontrado.");
        }
    }
}
