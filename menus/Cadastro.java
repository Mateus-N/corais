package menus;

import data.DataUsers;
import models.Hobbie;
import models.Usuario;

import java.util.InputMismatchException;
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

        DataUsers.listarHobbies(); // Listar hobbies para escolha do usuário
        System.out.println("Escolha seus interesses iniciais ou digite Avançar para prosseguir.");
        try {
            while (true) {
                String hobbieEscolhido = input.nextLine();
                if (hobbieEscolhido.equals("Avançar")) {
                    break;
                } else {
                    if (DataUsers.escolherHobbie(hobbieEscolhido, user)) {
                        System.out.println("Hobbie adicionado.");
                    } else {
                        System.out.println("Ops! Esse hobbie não existe. Tente novamente.");
                    }
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Isso não é um hobbie.Tente novamente.");
        }

    }
}