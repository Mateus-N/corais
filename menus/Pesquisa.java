package menus;

import java.util.List;
import java.util.Scanner;

import data.DataUsers;
import models.Grupo;
import models.Usuario;

// classe para realizar pesquisa
public class Pesquisa {
    private static Scanner in = new Scanner(System.in);

    public static void showMenu(Usuario user) {
        // recebe texto a ser pesquisado
        System.out.print("Pesquisa: ");
        String textoPesquisa = in.nextLine();

        // busca na lista de gupos do banco grupos que em seu nome contem
        // o texto digitado para pesquisa
        List<Grupo> gruposEncontrados = DataUsers.buscaGrupos(textoPesquisa);
        // exibe grupos encotrado na tela
        for (Grupo grupo : gruposEncontrados) {
            System.out.println(grupo.getNome());
        }
    
        // verifica se deseja entrar em algum dos grupos
        boolean desejaEntrarEmGrupo = MenuDuasOpcoes.pergunta("Deseja entrar em algum grupo?");
        if (desejaEntrarEmGrupo) {
            // caso sim busca o grupo e realiza a adicicao do usuario no grupo escolhido
            buscaEEntraEmGrupo(gruposEncontrados, user);
        }
    }

    private static void buscaEEntraEmGrupo(List<Grupo> gruposEncontrados, Usuario user) {
        // busca do grupo
        System.out.print("Nome do grupo que deseja entra: ");
        String grupoAIngressar = in.nextLine();
        
        // adiciona o usuario ao grupo
        for (Grupo grupo : gruposEncontrados) {
            if (grupo.getNome().toLowerCase().equals(grupoAIngressar.toLowerCase())) {
                DataUsers.entrarEmGrupo(grupo, user);
                break;
            }
        }
    }
}
