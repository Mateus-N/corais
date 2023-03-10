package menus;

import data.DataUsers;
import models.Usuario;

import java.util.Scanner;

public class Cadastro {
    private static Scanner input = new Scanner(System.in);

    public static void showMenu() {
        System.out.print("Nome: ");
        String nome = input.nextLine();

        System.out.print("Email: ");
        String email = input.nextLine();

        System.out.print("Senha: ");
        String senha = input.nextLine();

        Usuario user = new Usuario(nome, email, senha, null, null);
        DataUsers.addUsuario(user);
    }
}
