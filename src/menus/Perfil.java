package menus;

import models.Usuario;

// exibe informacoes do usuario e da acesso ao menu de edicao
public class Perfil {
    public static void showMenu(Usuario user) {
        System.out.println("Informações de perfil:");

        System.out.println("Nome: " + user.getNome());
        System.out.println("Email: " + user.getEmail());

        System.out.println("\nEndereço:");
        System.out.println("Cidade: " + user.getEndereco().getCidade());
        System.out.println("UF: " + user.getEndereco().getUf());

        System.out.println("\nContato: " + user.getContato().getTelefone());

        // pergunta de deseja editar o perfil
        boolean editarPerfil = MenuDuasOpcoes.pergunta("Editar perfil?");
        if (editarPerfil) {
            // caso sim vai para o menu de edicao
            EditarPerfil.showMenu(user);
            // apos sair do menu de edicao volta para o perfil com a recursividade abaixo
            // recursividade para exibir esse menu novamente
            showMenu(user);
        }
    }
}
