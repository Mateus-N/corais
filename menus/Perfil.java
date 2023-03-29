package menus;

import models.Usuario;

import java.util.Scanner;

public class Perfil {

    private static Scanner in = new Scanner(System.in);

    public static void showMenu(Usuario user) {
        System.out.println("Informações de perfil:");

        System.out.println("Nome: " + user.getNome());
        System.out.println("Email: " + user.getEmail());

        System.out.println("\nEndereço:");
        System.out.println("Logradouro: " + user.getEndereco().getLogradouro());
        System.out.println("Número ou lote: " + user.getEndereco().getNumeroOuLote());
        System.out.println("Bairro: " + user.getEndereco().getBairro());
        System.out.println("Cidade: " + user.getEndereco().getCidade());
        System.out.println("UF: " + user.getEndereco().getUf());

        System.out.println("\nContato: " + user.getContato().getTelefone());

        System.out.println("\n0 - Editar perfil\n1 - Voltar ao menu");

        int opcao = 0;
        while (opcao != 1) {
            opcao = Integer.parseInt(in.nextLine());

            if (opcao == 0) {
                EditarPerfil.showMenu(user);
            } else if (opcao == 1) {
                MenuInicial.showMenu(user);
            } else {
                System.out.println("Escolha uma opção válida");
            }
        }
    }
}
