package menus;

import data.DataUsers;
import models.Usuario;
import java.util.Scanner;

public class Login {
    private static Scanner input = new Scanner(System.in);

    public static void showMenu() {
        System.out.print("Email: ");
        String email = input.nextLine();

        System.out.print("Senha: ");
        String senha = input.nextLine();

        Usuario user = DataUsers.buscaUsuario(email);

        if (user != null && user.getSenha().equals(senha)) {
            System.out.println("Login com sucesso.");
            MenuInicial.showMenu(user);
        } else {
            System.out.println("Falha no login.");
        }
    }
}
