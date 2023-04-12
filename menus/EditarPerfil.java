package menus;

import models.Usuario;
import java.util.Scanner;

public class EditarPerfil {
    private static Scanner in = new Scanner(System.in);

    public static void showMenu(Usuario user) {
        int opcao = -1;

        while (opcao != 7) {
            try {
                opcao = mostraOpcoes();

                if (opcao == 0) {
                    System.out.print("Novo nome: ");
                    String novoNome = in.nextLine();
                    user.setNome(novoNome);
                } else if (opcao == 1) {
                    System.out.print("Novo logradouro: ");
                    String logradouro = in.nextLine();
                    user.getEndereco().setLogradouro(logradouro);
                } else if (opcao == 2) {
                    System.out.print("Novo numero ou lote: ");
                    String numeroOuLote = in.nextLine();
                    user.getEndereco().setNumeroOuLote(numeroOuLote);
                } else if (opcao == 3) {
                    System.out.print("Novo bairro: ");
                    String bairro = in.nextLine();
                    user.getEndereco().setBairro(bairro);
                } else if (opcao == 4) {
                    System.out.print("Nova Cidade: ");
                    String cidade = in.nextLine();
                    user.getEndereco().setCidade(cidade);
                } else if (opcao == 5) {
                    System.out.print("Nova UF: ");
                    String uf = in.nextLine();
                    user.getEndereco().setUf(uf);
                } else if (opcao == 6) {
                    System.out.print("Novo contato: ");
                    String contato = in.nextLine();
                    user.getContato().setTelefone(contato);
                } else if (opcao == 7) {
                    System.out.println("Voltanto ao perfil!");
                    Perfil.showMenu(user);
                } else {
                    System.out.println("Escolha uma opção válida");
                }
            } catch (Exception e) {
                System.out.println("Escolha uma opção válida");
            }
        }
    }

    private static int mostraOpcoes() {
        int opcao = -1;
        while (opcao < 0 || opcao > 7) {
            try {
                System.out.println(
                    "\n0 - Nome" +
                    "\n1 - Logradouro" +
                    "\n2 - Numero ou lote" +
                    "\n3 - Bairro" +
                    "\n4 - Cidade" +
                    "\n5 - UF" +
                    "\n6 - Contato" +
                    "\n7 - Sair"
                );

                opcao = Integer.parseInt(in.nextLine());

                if (opcao < 0 || opcao > 7) {
                    System.out.println("Escolha uma opção válida!");
                }
            } catch (Exception e) {
                System.out.println("Escolha uma opção válida!");
            }
        }

        return opcao;
    }
}
