package menus;

import data.DataUsers;
import models.Contato;
import models.Endereco;
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

        Usuario user;
        boolean querCadastroCompleto = perguntaCadastroCompleto();
        if (querCadastroCompleto) {
            Endereco endereco = cadastroEndereco();
            Contato contato = cadastroContato();
            user = new Usuario(nome, email, senha, endereco, contato);
        } else {
            user = new Usuario(nome, email, senha, new Endereco(), new Contato());
        }

        DataUsers.addUsuario(user);
        escolherHobbies(user);
    }

    private static Contato cadastroContato() {
        System.out.print("Telefone: ");
        String telefone = input.nextLine();

        Contato contato = new Contato(telefone);
        return contato;
    }

    private static Endereco cadastroEndereco() {
        System.out.print("Logradouro: ");
        String logradouro = input.nextLine();

        System.out.print("Numero ou Lote: ");
        String numeroOuLote = input.nextLine();

        System.out.print("Bairro: ");
        String bairro = input.nextLine();

        System.out.print("Cidade: ");
        String cidade = input.nextLine();

        System.out.print("UF: ");
        String uf = input.nextLine();

        Endereco endereco = new Endereco(logradouro, numeroOuLote, bairro, cidade, uf);
        return endereco;
    }

    private static boolean perguntaCadastroCompleto() {
        while (true) {
            System.out.println("\nDeseja efetuar o cadastro completo? 1 - Sim / 2 - Não");
            try {
                int opcao = Integer.parseInt(input.nextLine());
                if (opcao == 1) {
                    return true;
                } else if (opcao == 2) {
                    return false;
                } else {
                    System.out.println("\nEscolha uma opção válida");
                }
            } catch (Exception e) {
                System.out.println("\nEscolha uma opção válida");
            }
        }
    }

    private static void escolherHobbies(Usuario user) {
        DataUsers.listarHobbies(); // Listar hobbies para escolha do usuário
        System.out.println("Escolha seus interesses iniciais ou digite Avancar para prosseguir.");
        try { 
            while (true) {
                String hobbieEscolhido = input.nextLine();
                if (hobbieEscolhido.equals("Avancar")) {
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
            System.out.println("Isso não é um hobbie. Tente novamente.");
        }
    }
}