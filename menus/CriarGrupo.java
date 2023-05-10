package menus;

import data.DataUsers;
import models.Grupo;
import models.Hobbie;
import models.Usuario;
import java.util.Scanner;

// classe para criacao de grupo
public class CriarGrupo {
    private static Scanner in = new Scanner(System.in);

    // metodo que sera exibido
    public static void showMenu(Usuario user) {
        System.out.println("Criando novo grupo!");
        Hobbie hobbie = null;
        boolean continuar = true;
        // busca o grupo a qual o hobbie vai pertencer
        while (continuar) {
            DataUsers.listarHobbies();
            System.out.print("\nQual o hobbie a qual o grupo pertence? ");
            String hobbieEscolhido = in.nextLine();
            hobbie = DataUsers.buscarHobbie(hobbieEscolhido);

            // caso encontre o hobbie encerra a iteracao
            if (hobbie != null) {
                continuar = false;
            } else {
                System.out.println("\nHobbie inexistente! Escolha um Hobbie válido");
            }
        }

        // preenchimento de informacoes do grupo
        String nome = recebeNomeUnico();

        System.out.print("\nCidade: ");
        String cidade = in.nextLine();

        System.out.print("\nDescrição do grupo: ");
        String descricao = in.nextLine();

        // intancia do grupo
        Grupo grupo = new Grupo(nome, descricao, cidade, user, hobbie);
        // adiciona grupo ao banco e recupera o Id
        int grupoId = DataUsers.addGrupo(grupo);
        // adiciona Id do grupo na lista de grupos do usuario
        user.adicionarGrupo(grupoId);

        System.out.println("\nGrupo adicionado com sucesso!");
    }

    private static String recebeNomeUnico() {
        System.out.print("\nNome do grupo: ");
        String nome = in.nextLine();
        boolean grupoJaExiste = DataUsers.verificaNomeDeGrupoUnico(nome);
        if (!grupoJaExiste) {
            return nome;
        }
        System.out.println("Já existe um grupo cadastrado com esse nome! escolha outro por favor");
        return recebeNomeUnico();
    }
}
