package menus;

import data.DataUsers;
import models.Usuario;
import java.util.Scanner;

// classe para realizar login
public class Login {
    private static Scanner input = new Scanner(System.in);

    public static void showMenu() {
        // preenche email e senha
        System.out.print("Email: ");
        String email = input.nextLine();

        System.out.print("Senha: ");
        String senha = input.nextLine();

        // busca usuario no banco, caso não encontre retorna null
        Usuario user = DataUsers.buscaUsuario(email);

        // caso encontre o usuario e a senha esteja correta faz login
        if (user != null && user.getSenha().equals(senha)) {
            System.out.println("Login com sucesso.");
            MenuInicial.showMenu(user);
        } else {
            System.out.println("Falha no login.");
        }
    }
}
