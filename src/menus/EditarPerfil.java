package menus;

import models.Usuario;
import java.util.Scanner;

// Classe para editar ou preencher informacoes do perfil
public class EditarPerfil {
    private static Scanner in = new Scanner(System.in);

    public static void showMenu(Usuario user) {
        // Recebe escolha de edicao do usuario
        int opcao = mostraOpcoes();

        // altera o dado escolhido
        if (opcao == 0) {
            System.out.print("Novo nome: ");
            String novoNome = in.nextLine();
            user.setNome(novoNome);
        } else if (opcao == 1) {
            System.out.print("Nova Cidade: ");
            String cidade = in.nextLine();
            user.getEndereco().setCidade(cidade);
        } else if (opcao == 2) {
            System.out.print("Nova UF: ");
            String uf = in.nextLine();
            user.getEndereco().setUf(uf);
        } else if (opcao == 3) {
            System.out.print("Novo contato: ");
            String contato = in.nextLine();
            user.getContato().setTelefone(contato);
        } else if (opcao == 4) {
            System.out.println("Voltanto ao perfil!");
        } else {
            System.out.println("Escolha uma opção válida");
        }

        // caso nao escolha 7 para sair
        if (opcao != 4) {
            // recursividade para exibir esse menu novamente
            showMenu(user);
        }
        // caso o usuario escolha 7 encerra o menu de edicao
    }

    // recebe opcao do usuario e valida excecoes
    private static int mostraOpcoes() {
        int opcao = 0;
        try {
            System.out.println(
                "\n0 - Nome" +
                "\n1 - Cidade" +
                "\n2 - UF" +
                "\n3 - Contato" +
                "\n4 - Sair"
            );

            opcao = Integer.parseInt(in.nextLine());

            if (opcao < 0 || opcao > 4) {
                System.out.println("Escolha uma opção válida!");
                // recursividade para exibir esse menu novamente
                return mostraOpcoes();
            }
        } catch (Exception e) {
            System.out.println("Escolha uma opção válida!");
        }

        return opcao;
    }
}
